package Pack20DesignPatterns.CreationalPatterns.abstractfactory;

/**
 * 
 * The factory interface.
 * 
 */
public interface KingdomFactory {

	Castle createCastle();

	King createKing();

	Army createArmy();

}
