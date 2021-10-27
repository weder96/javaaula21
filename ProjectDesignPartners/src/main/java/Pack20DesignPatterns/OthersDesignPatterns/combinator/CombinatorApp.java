package Pack20DesignPatterns.OthersDesignPatterns.combinator;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The functional pattern representing a style of organizing libraries
 * centered around the idea of combining functions.
 * Putting it simply, there is some type T, some functions
 * for constructing "primitive" values of type T,
 * and some "combinators" which can combine values of type T
 * in various ways to build up more complex values of type T.
 * The class {@link Finder} defines a simple function {@link Finder#find(String)}
 * and connected functions
 * {@link Finder#or(Finder)},
 * {@link Finder#not(Finder)},
 * {@link Finder#and(Finder)}
 * Using them the became possible to get more complex functions {@link Finders}
 */
public class CombinatorApp {

  /**
   * Logger.
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(CombinatorApp.class);

  /**
   * main.
   * @param args args
   */
  public static void main(String[] args) {
    String[] queriesOr = new String[]{"many", "Annabel"};
    Finder finder = Finders.expandedFinder(queriesOr);
    List<String> res = finder.find(text());
    LOGGER.info("the result of expanded(or) query[{}] is {}", queriesOr, res);

    String[] queriesAnd = new String[]{"Annabel", "my"};
    finder = Finders.specializedFinder(queriesAnd);
    res = finder.find(text());
    LOGGER.info("the result of specialized(and) query[{}] is {}", queriesAnd, res);

    finder = Finders.advancedFinder("it was","kingdom","sea");
    res = finder.find(text());
    LOGGER.info("the result of advanced query is {}", res);

    res = Finders.filteredFinder(" was ", "many", "child").find(text());
    LOGGER.info("the result of filtered query is {}", res);


  }

  private static String text() {
    return
        "It was many and many a year ago,\n"
            + "In a kingdom by the sea,\n"
            + "That a maiden there lived whom you may know\n"
            + "By the name of ANNABEL LEE;\n"
            + "And this maiden she lived with no other thought\n"
            + "Than to love and be loved by me.\n"
            + "I was a child and she was a child,\n"
            + "In this kingdom by the sea;\n"
            + "But we loved with a love that was more than love-\n"
            + "I and my Annabel Lee;\n"
            + "With a love that the winged seraphs of heaven\n"
            + "Coveted her and me.";
  }

}
