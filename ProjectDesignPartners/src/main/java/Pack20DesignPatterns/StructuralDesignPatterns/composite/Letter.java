package Pack20DesignPatterns.StructuralDesignPatterns.composite;

/**
 * Letter.
 */
public class Letter extends LetterComposite {

  private char character;

  public Letter(char c) {
    this.character = c;
  }

  @Override
  protected void printThisBefore() {
    System.out.print(character);
  }
}
