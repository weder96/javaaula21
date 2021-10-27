package Pack20DesignPatterns.OthersDesignPatterns.bytecode.util;

import Pack20DesignPatterns.OthersDesignPatterns.bytecode.Instruction;

/**
 * Utility class used for instruction validation and conversion.
 */
public class InstructionConverterUtil {
  /**
   * Converts instructions represented as String.
   *
   * @param instructions to convert
   * @return array of int representing bytecode
   */
  public static int[] convertToByteCode(String instructions) {
    if (instructions == null || instructions.trim().length() == 0) {
      return new int[0];
    }

    String splitedInstructions [] = instructions.trim().split(" ");

    int [] bytecode = new int[splitedInstructions.length];

    for (int i = 0; i < splitedInstructions.length; i++) {
      if (isValidInstruction(splitedInstructions[i])) {
        bytecode[i] = Instruction.valueOf(splitedInstructions[i]).getIntValue();
      } else if (isValidInt(splitedInstructions[i])) {
        bytecode[i] = Integer.parseInt(splitedInstructions[i]);
      } else {
        String errorMessage = "Invalid instruction or number: " + splitedInstructions[i];
        throw new IllegalArgumentException(errorMessage);
      }
    }

    return bytecode;
  }

  private static boolean isValidInstruction(String instruction) {
    try {
      Instruction.valueOf(instruction);
      return true;
    } catch (IllegalArgumentException e) {
      return false;
    }
  }

  private static boolean isValidInt(String value) {
    try {
      Integer.parseInt(value);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }


}
