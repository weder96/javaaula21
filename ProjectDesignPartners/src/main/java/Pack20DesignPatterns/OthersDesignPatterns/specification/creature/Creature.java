package Pack20DesignPatterns.OthersDesignPatterns.specification.creature;


import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;

/**
 * 
 * Creature interface.
 *
 */
public interface Creature {

	String getName();
	
	Size getSize();
	
	Movement getMovement();
	
	Color getColor();
}
