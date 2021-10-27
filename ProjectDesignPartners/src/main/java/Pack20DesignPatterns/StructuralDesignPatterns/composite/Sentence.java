package Pack20DesignPatterns.StructuralDesignPatterns.composite;

import java.util.List;

/**
 * Sentence.
 */
public class Sentence extends LetterComposite {

  /**
   * Constructor.
   */
  public Sentence(List<Word> words) {
    words.forEach(this::add);
  }

  @Override
  protected void printThisAfter() {
    System.out.print(".");
  }
}
