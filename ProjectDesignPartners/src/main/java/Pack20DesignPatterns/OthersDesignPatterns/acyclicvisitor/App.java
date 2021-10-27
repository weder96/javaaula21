package Pack20DesignPatterns.OthersDesignPatterns.acyclicvisitor;

/**
 * The Acyclic Visitor pattern allows new functions to be added to existing class hierarchies
 * without affecting those hierarchies, and without creating the dependency cycles that are inherent
 * to the GoF Visitor pattern, by making the Visitor base class degenerate
 *
 * <p>In this example the visitor base class is {@link ModemVisitor}. The base class of the visited
 * hierarchy is {@link Modem} and has two children {@link Hayes} and {@link Zoom} each one having
 * its own visitor interface {@link HayesVisitor} and {@link ZoomVisitor} respectively. {@link
 * ConfigureForUnixVisitor} and {@link ConfigureForDosVisitor} implement each derivative's visit
 * method only if it is required
 */
public class App {

  /**
   * Program's entry point.
   */
  public static void main(String[] args) {
    ConfigureForUnixVisitor conUnix = new ConfigureForUnixVisitor();
    ConfigureForDosVisitor conDos = new ConfigureForDosVisitor();

    Zoom zoom = new Zoom();
    Hayes hayes = new Hayes();

    hayes.accept(conDos); // Hayes modem with Dos configurator
    zoom.accept(conDos); // Zoom modem with Dos configurator
    hayes.accept(conUnix); // Hayes modem with Unix configurator
    zoom.accept(conUnix); // Zoom modem with Unix configurator   
  }
}
