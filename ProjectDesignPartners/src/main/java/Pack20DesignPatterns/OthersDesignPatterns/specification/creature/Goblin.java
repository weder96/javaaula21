package Pack20DesignPatterns.OthersDesignPatterns.specification.creature;


import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;

/**
 * 
 * Goblin creature.
 *
 */
public class Goblin extends AbstractCreature {

	public Goblin() {
		super("Goblin", Size.SMALL, Movement.WALKING, Color.GREEN);
	}
}
