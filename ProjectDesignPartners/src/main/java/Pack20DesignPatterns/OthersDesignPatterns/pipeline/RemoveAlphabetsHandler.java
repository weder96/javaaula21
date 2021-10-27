package Pack20DesignPatterns.OthersDesignPatterns.pipeline;

import java.util.function.IntPredicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Stage handler that returns a new instance of String without the alphabet characters of the input
 * string.
 */
class RemoveAlphabetsHandler implements Handler<String, String> {

  private static final Logger LOGGER = LoggerFactory.getLogger(RemoveAlphabetsHandler.class);

  @Override
  public String process(String input) {
    StringBuilder inputWithoutAlphabets = new StringBuilder();
    IntPredicate isAlphabetic = (IntPredicate) Character::isAlphabetic;
    input.chars()
        .filter(isAlphabetic.negate())
        .mapToObj(x -> (char) x)
        .forEachOrdered(inputWithoutAlphabets::append);

    String inputWithoutAlphabetsStr = inputWithoutAlphabets.toString();
    LOGGER.info(
        String.format(
            "Current handler: %s, input is %s of type %s, output is %s, of type %s",
            RemoveAlphabetsHandler.class, input,
            String.class, inputWithoutAlphabetsStr, String.class
        )
    );

    return inputWithoutAlphabetsStr;
  }
}