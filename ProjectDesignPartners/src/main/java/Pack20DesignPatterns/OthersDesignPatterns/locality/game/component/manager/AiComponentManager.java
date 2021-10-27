package Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.manager;

import java.util.stream.IntStream;

import Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.AiComponent;
import Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AI component manager for Game.
 */
public class AiComponentManager {

  private static final Logger LOGGER = LoggerFactory.getLogger(AiComponentManager.class);

  private static final int MAX_ENTITIES = 10000;

  private final int numEntities;

  private static final Component[] AI_COMPONENTS = new AiComponent[MAX_ENTITIES];

  public AiComponentManager(int numEntities) {
    this.numEntities = numEntities;
  }

  /**
   * start AI component of Game.
   */
  public void start() {
    LOGGER.info("Start AI Game Component");
    IntStream.range(0, numEntities).forEach(i -> AI_COMPONENTS[i] = new AiComponent());
  }

  /**
   * Update AI component of Game.
   */
  public void update() {
    LOGGER.info("Update AI Game Component");
    IntStream.range(0, numEntities)
        .filter(i -> AI_COMPONENTS.length > i && AI_COMPONENTS[i] != null)
        .forEach(i -> AI_COMPONENTS[i].update());
  }
}
