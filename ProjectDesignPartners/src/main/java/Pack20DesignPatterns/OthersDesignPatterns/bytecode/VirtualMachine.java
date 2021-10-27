package Pack20DesignPatterns.OthersDesignPatterns.bytecode;

import java.util.Stack;

/**
 * Implementation of virtual machine.
 */
public class VirtualMachine {

  private Stack<Integer> stack = new Stack<>();

  private Wizard[] wizards = new Wizard[2];

  /**
   * Constructor.
   */
  public VirtualMachine() {
    for (int i = 0; i < wizards.length; i++) {
      wizards[i] = new Wizard();
    }
  }

  /**
   * Executes provided bytecode.
   *
   * @param bytecode to execute
   */
  public void execute(int[] bytecode) {
    for (int i = 0; i < bytecode.length; i++) {
      Instruction instruction = Instruction.getInstruction(bytecode[i]);
      switch (instruction) {
        case LITERAL:
          // Read the next byte from the bytecode.
          int value = bytecode[++i];
          stack.push(value);
          break;
        case SET_AGILITY:
          int amount = stack.pop();
          int wizard = stack.pop();
          setAgility(wizard, amount);
          break;
        case SET_WISDOM:
          amount = stack.pop();
          wizard = stack.pop();
          setWisdom(wizard, amount);
          break;
        case SET_HEALTH:
          amount = stack.pop();
          wizard = stack.pop();
          setHealth(wizard, amount);
          break;
        case GET_HEALTH:
          wizard = stack.pop();
          stack.push(getHealth(wizard));
          break;
        case GET_AGILITY:
          wizard = stack.pop();
          stack.push(getAgility(wizard));
          break;
        case GET_WISDOM:
          wizard = stack.pop();
          stack.push(getWisdom(wizard));
          break;
        case ADD:
          int a = stack.pop();
          int b = stack.pop();
          stack.push(a + b);
          break;
        case DIVIDE:
          a = stack.pop();
          b = stack.pop();
          stack.push(b / a);
          break;
        case PLAY_SOUND:
          wizard = stack.pop();
          getWizards()[wizard].playSound();
          break;
        case SPAWN_PARTICLES:
          wizard = stack.pop();
          getWizards()[wizard].spawnParticles();
          break;
        default:
          throw new IllegalArgumentException("Invalid instruction value");
      }
    }
  }

  public Stack<Integer> getStack() {
    return stack;
  }

  public void setHealth(int wizard, int amount) {
    wizards[wizard].setHealth(amount);
  }

  public void setWisdom(int wizard, int amount) {
    wizards[wizard].setWisdom(amount);
  }

  public void setAgility(int wizard, int amount) {
    wizards[wizard].setAgility(amount);
  }

  public int getHealth(int wizard) {
    return wizards[wizard].getHealth();
  }

  public int getWisdom(int wizard) {
    return wizards[wizard].getWisdom();
  }

  public int getAgility(int wizard) {
    return wizards[wizard].getAgility();
  }

  public Wizard[] getWizards() {
    return wizards;
  }
}
