package Pack20DesignPatterns.OthersDesignPatterns.specification.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Creature;
import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Dragon;
import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Goblin;
import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.KillerBee;
import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Octopus;
import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Shark;
import Pack20DesignPatterns.OthersDesignPatterns.specification.creature.Troll;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Color;
import Pack20DesignPatterns.OthersDesignPatterns.specification.property.Movement;
import Pack20DesignPatterns.OthersDesignPatterns.specification.selector.ColorSelector;
import Pack20DesignPatterns.OthersDesignPatterns.specification.selector.MovementSelector;

/**
 * 
 * The central idea of Specification pattern is to separate the statement of how to match a candidate, from the
 * candidate object that it is matched against. As well as its usefulness in selection, it is also valuable for
 * validation and for building to order.
 * 
 * In this example we have a pool of creatures with different properties. We then have defined separate selection
 * rules (Specifications) that we apply to the collection and as output receive only the creatures that match
 * the selection criteria.
 * 
 * http://martinfowler.com/apsupp/spec.pdf
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	// initialize creatures list
    	List<Creature> creatures = Arrays.asList(new Goblin(), new Octopus(), new Dragon(), new Shark(), new Troll(), new KillerBee());
    	// find all walking creatures
    	System.out.println("Find all walking creatures");
    	List<Creature> walkingCreatures = creatures.stream().filter(new MovementSelector(Movement.WALKING)).collect(Collectors.toList());
    	walkingCreatures.stream().forEach(System.out::println);
    	// find all dark creatures
    	System.out.println("Find all dark creatures");
    	List<Creature> darkCreatures = creatures.stream().filter(new ColorSelector(Color.DARK)).collect(Collectors.toList());
    	darkCreatures.stream().forEach(System.out::println);
    	// find all red and flying creatures
    	System.out.println("Find all red and flying creatures");
    	List<Creature> redAndFlyingCreatures = creatures.stream().filter(new ColorSelector(Color.RED).and(new MovementSelector(Movement.FLYING))).collect(Collectors.toList());
    	redAndFlyingCreatures.stream().forEach(System.out::println);
    }
}
