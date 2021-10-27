package Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.manager;

import java.util.stream.IntStream;

import Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.Component;
import Pack20DesignPatterns.OthersDesignPatterns.locality.game.component.RenderComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Render component manager for Game.
 */
public class RenderComponentManager {

  private static final Logger LOGGER = LoggerFactory.getLogger(RenderComponentManager.class);

  private static final int MAX_ENTITIES = 10000;

  private final int numEntities;

  private static final Component[] RENDER_COMPONENTS = new RenderComponent[MAX_ENTITIES];

  public RenderComponentManager(int numEntities) {
    this.numEntities = numEntities;
  }

  /**
   * Start render component.
   */
  public void start() {
    LOGGER.info("Start Render Game Component ");
    IntStream.range(0, numEntities).forEach(i -> RENDER_COMPONENTS[i] = new RenderComponent());
  }


  /**
   * render component.
   */
  public void render() {
    LOGGER.info("Update Render Game Component ");
    // Process Render.
    IntStream.range(0, numEntities)
        .filter(i -> RENDER_COMPONENTS.length > i && RENDER_COMPONENTS[i] != null)
        .forEach(i -> RENDER_COMPONENTS[i].render());
  }
}
