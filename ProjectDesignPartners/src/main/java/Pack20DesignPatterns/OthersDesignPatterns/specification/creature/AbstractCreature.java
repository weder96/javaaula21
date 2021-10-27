package Pack20DesignPatterns.OthersDesignPatterns.specification.creature;


import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;

/**
 * 
 * Base class for concrete creatures.
 *
 */
public abstract class AbstractCreature implements Creature {

	private String name;
	private Size size;
	private Movement movement;
	private Color color;

	public AbstractCreature(String name, Size size, Movement movement, Color color) {
		this.name = name;
		this.size = size;
		this.movement = movement;
		this.color = color;
	}	
	
	@Override
	public String toString() {
		return String.format("%s [size=%s, movement=%s, color=%s]", name, size, movement, color);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Size getSize() {
		return size;
	}
	
	@Override
	public Movement getMovement() {
		return movement;
	}
	
	@Override
	public Color getColor() {
		return color;
	}
}
