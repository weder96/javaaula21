package project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ResourceLock;
import util.ListWriter;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;
import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ;
import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ_WRITE;
import static org.junit.jupiter.api.parallel.Resources.SYSTEM_PROPERTIES;

@Execution(CONCURRENT)
class SharedResourcesDemoTests {

	private Properties backup;

	@BeforeEach
	void backup() {
		backup = new Properties();
		backup.putAll(System.getProperties());
	}

	@AfterEach
	void restore() {
		System.setProperties(backup);
	}

	@Test
	@ResourceLock(value = SYSTEM_PROPERTIES, mode = READ)
	void customPropertyIsNotSetByDefault() {
		assertNull(System.getProperty("my.prop"));
	}

	@Test
	@ResourceLock(value = SYSTEM_PROPERTIES, mode = READ_WRITE)
	void canSetCustomPropertyToApple() {
		System.setProperty("my.prop", "apple");
		assertEquals("apple", System.getProperty("my.prop"));
	}

	@Test
	@ResourceLock(value = SYSTEM_PROPERTIES, mode = READ_WRITE)
	void canSetCustomPropertyToBanana() {
		System.setProperty("my.prop", "banana");
		assertEquals("banana", System.getProperty("my.prop"));
	}

	@Test
	void writeItemsToFile(@TempDir Path tempDir) throws IOException {
		Path file = tempDir.resolve("test.txt");

		new ListWriter(file).write("a", "b", "c");

		assertEquals(singletonList("a,b,c"), Files.readAllLines(file));
	}


	/*
	Migration Tips

	The following are topics that you should be aware of when migrating existing JUnit 4 tests to JUnit Jupiter.

	Annotations reside in the org.junit.jupiter.api package.

	Assertions reside in org.junit.jupiter.api.Assertions.

	Note that you may continue to use assertion methods from org.junit.Assert or any other assertion library such as AssertJ, Hamcrest, Truth, etc.

	Assumptions reside in org.junit.jupiter.api.Assumptions.

	Note that JUnit Jupiter 5.4 and later versions support methods from JUnit 4’s org.junit.Assume class for assumptions. Specifically, JUnit Jupiter supports JUnit 4’s AssumptionViolatedException to signal that a test should be aborted instead of marked as a failure.

	@Before and @After no longer exist; use @BeforeEach and @AfterEach instead.

	@BeforeClass and @AfterClass no longer exist; use @BeforeAll and @AfterAll instead.

	@Ignore no longer exists: use @Disabled or one of the other built-in execution conditions instead

	See also JUnit 4 @Ignore Support.

	@Category no longer exists; use @Tag instead.

	@RunWith no longer exists; superseded by @ExtendWith.

	@Rule and @ClassRule no longer exist; superseded by @ExtendWith and @RegisterExtension

	See also Limited JUnit 4 Rule Support.
	*/




}
