package project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LifeCycleTest {

	private static final Logger logger = LoggerFactory.getLogger(RepeatedDemoTests.class);

	@BeforeAll
	static void beforeAll(TestInfo testInfo) {
		logger.info("BeforeAll");

	}

	@DisplayName("Add operation test")
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		Calculator calculator = new Calculator();
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}


	@AfterAll
	static void afterAll(TestInfo testInfo) {
		logger.info("AfterAll");
	}

}
