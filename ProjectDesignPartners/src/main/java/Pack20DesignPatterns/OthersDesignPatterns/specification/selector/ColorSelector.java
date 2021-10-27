package Pack20DesignPatterns.OthersDesignPatterns.specification.selector;

import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Creature;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;

import java.util.function.Predicate;


/**
 * 
 * Color selector.
 *
 */
public class ColorSelector implements Predicate<Creature> {

	private final Color c;

	public ColorSelector(Color c) {
		this.c = c;
	}
	
	@Override
	public boolean test(Creature t) {
		return t.getColor().equals(c);
	}
}
