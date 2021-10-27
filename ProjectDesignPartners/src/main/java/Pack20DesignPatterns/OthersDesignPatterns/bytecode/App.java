package Pack20DesignPatterns.OthersDesignPatterns.bytecode;

import java.util.Stack;

import Pack20DesignPatterns.OthersDesignPatterns.bytecode.util.InstructionConverterUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The intention of Bytecode pattern is to give behavior the flexibility of data by encoding it as
 * instructions for a virtual machine. An instruction set defines the low-level operations that can
 * be performed. A series of instructions is encoded as a sequence of bytes. A virtual machine
 * executes these instructions one at a time, using a stack for intermediate values. By combining
 * instructions, complex high-level behavior can be defined.
 *
 * <p>This pattern should be used when there is a need to define high number of behaviours and
 * implementation engine is not a good choice because It is too lowe level Iterating on it takes too
 * long due to slow compile times or other tooling issues. It has too much trust. If you want to
 * ensure the behavior being defined can’t break the game, you need to sandbox it from the rest of
 * the codebase.
 */
public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  /**
   * Main app method.
   *
   * @param args command line args
   */
  public static void main(String[] args) {

    Wizard wizard = new Wizard();
    wizard.setHealth(45);
    wizard.setAgility(7);
    wizard.setWisdom(11);

    VirtualMachine vm = new VirtualMachine();
    vm.getWizards()[0] = wizard;

    interpretInstruction("LITERAL 0", vm);
    interpretInstruction("LITERAL 0", vm);
    interpretInstruction("GET_HEALTH", vm);
    interpretInstruction("LITERAL 0", vm);
    interpretInstruction("GET_AGILITY", vm);
    interpretInstruction("LITERAL 0", vm);
    interpretInstruction("GET_WISDOM ", vm);
    interpretInstruction("ADD", vm);
    interpretInstruction("LITERAL 2", vm);
    interpretInstruction("DIVIDE", vm);
    interpretInstruction("ADD", vm);
    interpretInstruction("SET_HEALTH", vm);
  }

  private static void interpretInstruction(String instruction, VirtualMachine vm) {
    vm.execute(InstructionConverterUtil.convertToByteCode(instruction));
    Stack<Integer> stack = vm.getStack();
    LOGGER.info(instruction + String.format("%" + (12 - instruction.length()) + "s", "") + stack);
  }
}
