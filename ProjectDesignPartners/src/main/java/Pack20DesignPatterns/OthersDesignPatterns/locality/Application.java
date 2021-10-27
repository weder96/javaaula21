package Pack20DesignPatterns.OthersDesignPatterns.locality;

import Pack20DesignPatterns.OthersDesignPatterns.locality.game.GameEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Use the Data Locality pattern is when you have a performance problem. Take advantage of that to
 * improve performance by increasing data locality — keeping data in contiguous memory in the order
 * that you process it.
 *
 * <p>Example:  Game loop that processes a bunch of game entities. Those entities are decomposed
 * into different domains  — AI, physics, and rendering — using the Component pattern.
 */
public class Application {

  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  private static final int NUM_ENTITIES = 5;

  /**
   * Start game loop with each component have NUM_ENTITIES instance.
   */
  public static void main(String[] args) {
    LOGGER.info("Start Game Application using Data-Locality pattern");
    GameEntity gameEntity = new GameEntity(NUM_ENTITIES);
    gameEntity.start();
    gameEntity.update();
  }
}
