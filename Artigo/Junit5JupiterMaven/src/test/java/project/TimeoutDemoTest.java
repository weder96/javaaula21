package project;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutDemoTest {
	@BeforeEach
	@Timeout(5)
	void setUp() {
		// fails if execution time exceeds 5 seconds
	}

	@Test
	@Timeout(value = 30, unit = TimeUnit.SECONDS)
	void failsIfExecutionTimeExceeds100Milliseconds() {
		// fails if execution time exceeds 100 milliseconds
	}



}
