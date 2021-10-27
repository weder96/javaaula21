package Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.manager;


import java.util.stream.IntStream;

import Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.Component;
import Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.PhysicsComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Physics component Manager for Game.
 */
public class PhysicsComponentManager {

  private static final Logger LOGGER = LoggerFactory.getLogger(PhysicsComponentManager.class);

  private static final int MAX_ENTITIES = 10000;

  private final int numEntities;

  private static final Component[] PHYSICS_COMPONENTS = new PhysicsComponent[MAX_ENTITIES];

  public PhysicsComponentManager(int numEntities) {
    this.numEntities = numEntities;
  }

  /**
   * Start physics component of Game.
   */
  public void start() {
    LOGGER.info("Start Physics Game Component ");
    IntStream.range(0, numEntities).forEach(i -> PHYSICS_COMPONENTS[i] = new PhysicsComponent());
  }


  /**
   * Update physics component of Game.
   */
  public void update() {
    LOGGER.info("Update Physics Game Component ");
    // Process physics.
    IntStream.range(0, numEntities)
        .filter(i -> PHYSICS_COMPONENTS.length > i && PHYSICS_COMPONENTS[i] != null)
        .forEach(i -> PHYSICS_COMPONENTS[i].update());
  }
}
