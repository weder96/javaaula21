package Pack20DesignPatterns.OthersDesignPatterns.ambassador;

/**
 * The ambassador pattern creates a helper service that sends network requests on behalf of a
 * client. It is often used in cloud-based applications to offload features of a remote service.
 *
 * <p>An ambassador service can be thought of as an out-of-process proxy that is co-located with
 * the client. Similar to the proxy design pattern, the ambassador service provides an interface for
 * another remote service. In addition to the interface, the ambassador provides extra functionality
 * and features, specifically offloaded common connectivity tasks. This usually consists of
 * monitoring, logging, routing, security etc. This is extremely useful in legacy applications where
 * the codebase is difficult to modify and allows for improvements in the application's networking
 * capabilities.
 *
 * <p>In this example, we will the ({@link ServiceAmbassador}) class represents the ambassador while
 * the
 * ({@link RemoteService}) class represents a remote application.
 */
public class App {

  /**
   * Entry point.
   */
  public static void main(String[] args) {
    Client host1 = new Client();
    Client host2 = new Client();
    host1.useService(12);
    host2.useService(73);
  }
}
