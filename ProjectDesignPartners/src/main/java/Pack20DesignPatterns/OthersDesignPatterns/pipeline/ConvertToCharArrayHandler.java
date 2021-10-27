package Pack20DesignPatterns.OthersDesignPatterns.pipeline;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Stage handler that converts an input String to its char[] array counterpart.
 */
class ConvertToCharArrayHandler implements Handler<String, char[]> {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConvertToCharArrayHandler.class);

  @Override
  public char[] process(String input) {
    char[] characters = input.toCharArray();
    String string = Arrays.toString(characters);
    LOGGER.info(
        String.format("Current handler: %s, input is %s of type %s, output is %s, of type %s",
            ConvertToCharArrayHandler.class, input, String.class, string, Character[].class)
    );

    return characters;
  }
}
