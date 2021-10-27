package Pack20DesignPatterns.OthersDesignPatterns.mutex;

/**
 * A Mutex prevents multiple threads from accessing a resource simultaneously.
 *
 * <p>In this example we have two thieves who are taking beans from a jar. Only one thief can take
 * a bean at a time. This is ensured by a Mutex lock which must be acquired in order to access the
 * jar. Each thief attempts to acquire the lock, take a bean and then release the lock. If the lock
 * has already been acquired, the thief will be prevented from continuing (blocked) until the lock
 * has been released. The thieves stop taking beans once there are no beans left to take.
 */
public class App {

  /**
   * main method.
   */
  public static void main(String[] args) {
    Mutex mutex = new Mutex();
    Jar jar = new Jar(1000, mutex);
    Thief peter = new Thief("Peter", jar);
    Thief john = new Thief("John", jar);
    peter.start();
    john.start();
  }

}
