package project;

import java.time.LocalDate;

import aggregator.PersonAggregator;
import domain.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArgumentAggregationTests {

	@ParameterizedTest
	@CsvSource({
		"Jane, Doe, F, 1990-05-20",
		"John, Doe, M, 1990-10-22"
	})
	void testWithArgumentsAccessor(ArgumentsAccessor arguments) {
		Person person = new Person(arguments.getString(0),
			arguments.getString(1),
			arguments.get(2, Person.Gender.class),
			arguments.get(3, LocalDate.class));

		if (person.getFirstName().equals("Jane")) {
			assertEquals(Person.Gender.F, person.getGender());
		}
		else {
			assertEquals(Person.Gender.M, person.getGender());
		}
		assertEquals("Doe", person.getLastName());
		assertEquals(1990, person.getDateOfBirth().getYear());
	}

	@ParameterizedTest
	@CsvSource({
		"Jane, Doe, F, 1990-05-20",
		"John, Doe, M, 1990-10-22"
	})
	void testWithArgumentsAggregator(@AggregateWith(PersonAggregator.class) Person person) {
		// perform assertions against person
	}


	// Customizing Display Names
	@DisplayName("Display name of container")
	@ParameterizedTest(name = "{index} ==> the rank of ''{0}'' is {1}")
	@CsvSource({ "apple, 1", "banana, 2", "'lemon, lime', 3" })
	void testWithCustomDisplayNames(String fruit, int rank) {
	}

}
