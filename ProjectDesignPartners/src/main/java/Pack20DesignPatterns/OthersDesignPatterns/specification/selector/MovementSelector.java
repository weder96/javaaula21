package Pack20DesignPatterns.OthersDesignPatterns.specification.selector;

import java.util.function.Predicate;

import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Creature;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;

/**
 * 
 * Movement selector.
 *
 */
public class MovementSelector implements Predicate<Creature> {
	
	private final Movement m;

	public MovementSelector(Movement m) {
		this.m = m;
	}

	@Override
	public boolean test(Creature t) {
		return t.getMovement().equals(m);
	}
}
