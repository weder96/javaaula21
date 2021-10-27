package Pack20DesignPatterns.OthersDesignPatterns.collectionpipeline;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * In imperative-style programming, it is common to use for and while loops for most kinds of data
 * processing. Function composition is a simple technique that lets you sequence modular functions
 * to create more complex operations. When you run data through the sequence, you have a collection
 * pipeline. Together, the Function Composition and Collection Pipeline patterns enable you to
 * create sophisticated programs where data flow from upstream to downstream and is passed through a
 * series of transformations.
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    List<Car> cars = CarFactory.createCars();

    List<String> modelsImperative = ImperativeProgramming.getModelsAfter2000(cars);
    LOGGER.info(modelsImperative.toString());

    List<String> modelsFunctional = FunctionalProgramming.getModelsAfter2000(cars);
    LOGGER.info(modelsFunctional.toString());

    Map<Category, List<Car>> groupingByCategoryImperative = ImperativeProgramming.getGroupingOfCarsByCategory(cars);
    LOGGER.info(groupingByCategoryImperative.toString());

    Map<Category, List<Car>> groupingByCategoryFunctional = FunctionalProgramming.getGroupingOfCarsByCategory(cars);
    LOGGER.info(groupingByCategoryFunctional.toString());

    Person john = new Person(cars);

    List<Car> sedansOwnedImperative = ImperativeProgramming.getSedanCarsOwnedSortedByDate(Arrays.asList(john));
    LOGGER.info(sedansOwnedImperative.toString());

    List<Car> sedansOwnedFunctional = FunctionalProgramming.getSedanCarsOwnedSortedByDate(Arrays.asList(john));
    LOGGER.info(sedansOwnedFunctional.toString());
  }
}
