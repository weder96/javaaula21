package Pack20DesignPatterns.OthersDesignPatterns.specification.creature;

import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;
/**
 * 
 * KillerBee creature.
 *
 */
public class KillerBee extends AbstractCreature {

	public KillerBee() {
		super("KillerBee", Size.SMALL, Movement.FLYING, Color.LIGHT);
	}
}
