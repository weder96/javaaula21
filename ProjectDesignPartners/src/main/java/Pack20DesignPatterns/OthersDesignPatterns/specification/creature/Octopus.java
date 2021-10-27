package Pack20DesignPatterns.OthersDesignPatterns.specification.creature;

import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;

/**
 * 
 * Octopus creature.
 *
 */
public class Octopus extends AbstractCreature {

	public Octopus() {
		super("Octopus", Size.NORMAL, Movement.SWIMMING, Color.DARK);
	}
}
