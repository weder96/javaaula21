package Pack20DesignPatterns.OthersDesignPatterns.specification.creature;

import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;
/**
 * 
 * Troll creature.
 *
 */
public class Troll extends AbstractCreature {
	
	public Troll() {
		super("Troll", Size.LARGE, Movement.WALKING, Color.DARK);
	}
}
