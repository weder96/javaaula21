package Pack20DesignPatterns.OthersDesignPatterns.databus.members;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import Pack20DesignPatterns.OthersDesignPatterns.databus.DataType;
import Pack20DesignPatterns.OthersDesignPatterns.databus.Member;
import Pack20DesignPatterns.OthersDesignPatterns.databus.data.MessageData;

/**
 * Receiver of Data-Bus events that collects the messages from each {@link MessageData}.
 *
 * @author Paul Campbell (pcampbell@kemitix.net)
 */
public class MessageCollectorMember implements Member {

  private static final Logger LOGGER = Logger.getLogger(MessageCollectorMember.class.getName());

  private final String name;

  private List<String> messages = new ArrayList<>();

  public MessageCollectorMember(String name) {
    this.name = name;
  }

  @Override
  public void accept(final DataType data) {
    if (data instanceof MessageData) {
      handleEvent((MessageData) data);
    }
  }

  private void handleEvent(MessageData data) {
    LOGGER.info(String.format("%s sees message %s", name, data.getMessage()));
    messages.add(data.getMessage());
  }

  public List<String> getMessages() {
    return messages;
  }
}
