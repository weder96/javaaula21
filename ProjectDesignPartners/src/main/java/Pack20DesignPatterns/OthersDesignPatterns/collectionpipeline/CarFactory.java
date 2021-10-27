package Pack20DesignPatterns.OthersDesignPatterns.collectionpipeline;

import java.util.Arrays;
import java.util.List;

/**
 * A factory class to create a collection of {@link Car} instances.
 */
public class CarFactory {
  private CarFactory() {
  }

  /**
   * Factory method to create a {@link List} of {@link Car} instances.
   *
   * @return {@link List} of {@link Car}
   */
  public static List<Car> createCars() {
    return Arrays.asList(new Car("Jeep", "Wrangler", 2011, Category.JEEP),
        new Car("Jeep", "Comanche", 1990, Category.JEEP),
        new Car("Dodge", "Avenger", 2010, Category.SEDAN),
        new Car("Buick", "Cascada", 2016, Category.CONVERTIBLE),
        new Car("Ford", "Focus", 2012, Category.SEDAN),
        new Car("Chevrolet", "Geo Metro", 1992, Category.CONVERTIBLE));
  }
}