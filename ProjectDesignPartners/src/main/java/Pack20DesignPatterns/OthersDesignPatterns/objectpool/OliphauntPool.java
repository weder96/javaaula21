package Pack20DesignPatterns.OthersDesignPatterns.objectpool;

/**
 * 
 * Oliphaunt object pool
 *
 */
public class OliphauntPool extends ObjectPool<Oliphaunt> {

	@Override
	protected Oliphaunt create() {
		return new Oliphaunt();
	}
}
