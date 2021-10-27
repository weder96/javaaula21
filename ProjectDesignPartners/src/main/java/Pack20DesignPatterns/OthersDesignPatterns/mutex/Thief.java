package Pack20DesignPatterns.OthersDesignPatterns.mutex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Thief is a class which continually tries to acquire a jar and take a bean from it. When the jar
 * is empty the thief stops.
 */
public class Thief extends Thread {

  private static final Logger LOGGER = LoggerFactory.getLogger(Thief.class);

  /**
   * The name of the thief.
   */
  private final String name;

  /**
   * The jar.
   */
  private final Jar jar;

  public Thief(String name, Jar jar) {
    this.name = name;
    this.jar = jar;
  }

  /**
   * In the run method the thief repeatedly tries to take a bean until none are left.
   */
  @Override
  public void run() {
    int beans = 0;

    while (jar.takeBean()) {
      beans = beans + 1;
      LOGGER.info("{} took a bean.", name);
    }

    LOGGER.info("{} took {} beans.", name, beans);
  }

}
