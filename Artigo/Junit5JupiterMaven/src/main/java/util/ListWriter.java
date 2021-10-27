package util;

import static java.util.Collections.singletonList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListWriter {

	private final Path file;

	public ListWriter(Path file) {
		this.file = file;
	}

	public void write(String... items) throws IOException {
		Files.write(file, singletonList(String.join(",", items)));
	}
}