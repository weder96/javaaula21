package Pack20DesignPatterns.OthersDesignPatterns.monostate;

import java.util.ArrayList;
import java.util.List;

/**
 * The LoadBalancer class. This implements the MonoState pattern. It holds a series of servers. Upon
 * receiving a new Request, it delegates the call to the servers in a Round Robin Fashion. Since all
 * instances of the class share the same state, all instances will delegate to the same server on
 * receiving a new Request.
 */

public class LoadBalancer {
  private static final List<Server> SERVERS = new ArrayList<>();
  private static int lastServedId;

  static {
    int id = 0;
    for (int port : new int[]{8080, 8081, 8082, 8083, 8084}) {
      SERVERS.add(new Server("localhost", port, ++id));
    }
  }

  /**
   * Add new server.
   */
  public final void addServer(Server server) {
    synchronized (SERVERS) {
      SERVERS.add(server);
    }

  }

  public final int getNoOfServers() {
    return SERVERS.size();
  }

  public int getLastServedId() {
    return lastServedId;
  }

  /**
   * Handle request.
   */
  public synchronized void serverRequest(Request request) {
    if (lastServedId >= SERVERS.size()) {
      lastServedId = 0;
    }
    Server server = SERVERS.get(lastServedId++);
    server.serve(request);
  }

}
