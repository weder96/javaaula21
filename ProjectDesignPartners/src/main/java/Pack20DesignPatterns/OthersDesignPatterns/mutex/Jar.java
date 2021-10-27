package Pack20DesignPatterns.OthersDesignPatterns.mutex;

/**
 * A Jar has a resource of beans which can only be accessed by a single Thief (thread) at any one
 * time. A Mutex lock is used to prevent more than one Thief taking a bean simultaneously.
 */
public class Jar {

  /**
   * The lock which must be acquired to access the beans resource.
   */
  private final Lock lock;

  /**
   * The resource within the jar.
   */
  private int beans;

  public Jar(int beans, Lock lock) {
    this.beans = beans;
    this.lock = lock;
  }

  /**
   * Method for a thief to take a bean.
   */
  public boolean takeBean() {
    boolean success = false;
    try {
      lock.acquire();
      success = beans > 0;
      if (success) {
        beans = beans - 1;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.release();
    }

    return success;
  }

}
