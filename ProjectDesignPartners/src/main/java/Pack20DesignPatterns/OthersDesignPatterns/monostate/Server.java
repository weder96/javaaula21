package Pack20DesignPatterns.OthersDesignPatterns.monostate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Server class. Each Server sits behind a LoadBalancer which delegates the call to the servers
 * in a simplistic Round Robin fashion.
 */
public class Server {

  private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

  public final String host;
  public final int port;
  public final int id;

  /**
   * Constructor.
   */
  public Server(String host, int port, int id) {
    this.host = host;
    this.port = port;
    this.id = id;
  }

  public String getHost() {
    return host;
  }

  public int getPort() {
    return port;
  }

  public void serve(Request request) {
    LOGGER.info("Server ID {} associated to host : {} and port {}. Processed request with value {}",
        id, host, port, request.value);
  }
}
