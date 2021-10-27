package Pack20DesignPatterns.OthersDesignPatterns.specification.selector;

import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Creature;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Size;

import java.util.function.Predicate;



/**
 * 
 * Size selector.
 *
 */
public class SizeSelector implements Predicate<Creature> {

	private final Size s;

	public SizeSelector(Size s) {
		this.s = s;
	}
	
	@Override
	public boolean test(Creature t) {
		return t.getSize().equals(s);
	}
}
