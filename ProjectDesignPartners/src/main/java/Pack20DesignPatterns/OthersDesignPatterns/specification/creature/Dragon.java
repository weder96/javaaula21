package Pack20DesignPatterns.OthersDesignPatterns.specification.creature;

import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;

/**
 * 
 * Dragon creature.
 *
 */
public class Dragon extends AbstractCreature {

	public Dragon() {
		super("Dragon", Size.LARGE, Movement.FLYING, Color.RED);
	}
}
