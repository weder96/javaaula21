package Pack20DesignPatterns.StructuralDesignPatterns.composite;

import java.util.List;

/**
 * Word.
 */
public class Word extends LetterComposite {

  /**
   * Constructor.
   */
  public Word(List<Letter> letters) {
    letters.forEach(this::add);
  }

  /**
   * Constructor.
   * @param letters to include
   */
  public Word(char... letters) {
    for (char letter : letters) {
      this.add(new Letter(letter));
    }
  }

  @Override
  protected void printThisBefore() {
    System.out.print(" ");
  }
}
