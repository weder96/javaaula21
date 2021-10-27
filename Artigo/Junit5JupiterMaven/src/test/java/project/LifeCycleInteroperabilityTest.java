package project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LifeCycleInteroperabilityTest {

	private static final Logger logger = LoggerFactory.getLogger(RepeatedDemoTests.class);

	@BeforeEach
	void beforeEach(TestInfo testInfo) {
		logger.info("BeforeEach");
	}

	@ParameterizedTest
	@ValueSource(strings = "apple")
	void testWithRegularParameterResolver(String argument, TestReporter testReporter) {
		testReporter.publishEntry("argument", argument);
	}

	@AfterEach
	void afterEach(TestInfo testInfo) {
		logger.info("AfterEach");
	}



}
