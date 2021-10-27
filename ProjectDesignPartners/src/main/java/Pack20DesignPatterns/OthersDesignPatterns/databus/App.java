package Pack20DesignPatterns.OthersDesignPatterns.databus;

import java.time.LocalDateTime;

import Pack20DesignPatterns.OthersDesignPatterns.databus.data.MessageData;
import Pack20DesignPatterns.OthersDesignPatterns.databus.data.StartingData;
import Pack20DesignPatterns.OthersDesignPatterns.databus.data.StoppingData;
import Pack20DesignPatterns.OthersDesignPatterns.databus.members.MessageCollectorMember;
import Pack20DesignPatterns.OthersDesignPatterns.databus.members.StatusMember;

/**
 * The Data Bus pattern.
 *
 * @author Paul Campbell (pcampbell@kemitix.net)
 * @see <a href="http://wiki.c2.com/?DataBusPattern">http://wiki.c2.com/?DataBusPattern</a>
 *     <p>The Data-Bus pattern provides a method where different parts of an application may
 *     pass messages between each other without needing to be aware of the other's existence.</p>
 *     <p>Similar to the {@code ObserverPattern}, members register themselves with the {@link
 *     DataBus} and may then receive each piece of data that is published to the Data-Bus. The
 *     member may react to any given message or not.</p>
 *     <p>It allows for Many-to-Many distribution of data, as there may be any number of
 *     publishers to a Data-Bus, and any number of members receiving the data. All members will
 *     receive the same data, the order each receives a given piece of data, is an implementation
 *     detail.</p>
 *     <p>Members may unsubscribe from the Data-Bus to stop receiving data.</p>
 *     <p>This example of the pattern implements a Synchronous Data-Bus, meaning that
 *     when data is published to the Data-Bus, the publish method will not return until all members
 *     have received the data and returned.</p>
 *     <p>The {@link DataBus} class is a Singleton.</p>
 *     <p>Members of the Data-Bus must implement the {@link Member} interface.</p>
 *     <p>Data to be published via the Data-Bus must implement the {@link DataType} interface.</p>
 *     <p>The {@code data} package contains example {@link DataType} implementations.</p>
 *     <p>The {@code members} package contains example {@link Member} implementations.</p>
 *     <p>The {@link StatusMember} demonstrates using the DataBus to publish a message
 *     to the Data-Bus when it receives a message.</p>
 */
class App {

  public static void main(String[] args) {
    final DataBus bus = DataBus.getInstance();
    bus.subscribe(new StatusMember(1));
    bus.subscribe(new StatusMember(2));
    final MessageCollectorMember foo = new MessageCollectorMember("Foo");
    final MessageCollectorMember bar = new MessageCollectorMember("Bar");
    bus.subscribe(foo);
    bus.publish(StartingData.of(LocalDateTime.now()));
    bus.publish(MessageData.of("Only Foo should see this"));
    bus.subscribe(bar);
    bus.publish(MessageData.of("Foo and Bar should see this"));
    bus.unsubscribe(foo);
    bus.publish(MessageData.of("Only Bar should see this"));
    bus.publish(StoppingData.of(LocalDateTime.now()));
  }
}
