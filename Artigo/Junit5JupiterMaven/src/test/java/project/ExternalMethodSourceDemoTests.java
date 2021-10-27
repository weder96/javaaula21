package project;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExternalMethodSourceDemoTests {

	@ParameterizedTest
	@MethodSource("project.StringsProviders#tinyStrings")
	void testWithExternalMethodSource(String tinyString) {
		// test with tiny string
	}
}

class StringsProviders {

	static Stream<String> tinyStrings() {
		return Stream.of(".", "oo", "OOO");
	}
}