package Pack20DesignPatterns.OthersDesignPatterns.specification.creature;

import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;

/**
 * 
 * Shark creature.
 *
 */
public class Shark extends AbstractCreature {

	public Shark() {
		super("Shark", Size.NORMAL, Movement.SWIMMING, Color.LIGHT);
	}
}
