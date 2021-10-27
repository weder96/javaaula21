package Pack20DesignPatterns.OthersDesignPatterns.databus.data;

import java.time.LocalDateTime;

import Pack20DesignPatterns.OthersDesignPatterns.databus.AbstractDataType;
import Pack20DesignPatterns.OthersDesignPatterns.databus.DataType;

/**
 * An event raised when applications starts, containing the start time of the application.
 *
 * @author Paul Campbell (pcampbell@kemitix.net)
 */
public class StartingData extends AbstractDataType {

  private final LocalDateTime when;

  public StartingData(LocalDateTime when) {
    this.when = when;
  }

  public LocalDateTime getWhen() {
    return when;
  }

  public static DataType of(final LocalDateTime when) {
    return new StartingData(when);
  }
}
