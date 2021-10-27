package Pack20DesignPatterns.CreationalPatterns.abstractfactory;

/**
 * 
 * Concrete factory.
 * 
 */
public class ElfKingdomFactory implements KingdomFactory {

	public Castle createCastle() {
		return new ElfCastle();
	}

	public King createKing() {
		return new ElfKing();
	}

	public Army createArmy() {
		return new ElfArmy();
	}

}
