package project;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedTestsDemo {

	@Test
	@Order(3)
	void nullValues() {
		// perform assertions against null values
	}

	@Test
	@Order(2)
	void emptyValues() {
		// perform assertions against empty values
	}

	@Test
	@Order(1)
	void validValues() {
		// perform assertions against valid values
	}

}