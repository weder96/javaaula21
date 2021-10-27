package OCA08_Handling_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DoNotCloseResourceInTry {

	public static void main(String[] args) {
		DoNotCloseResourceInTry.doNotCloseResourceInTry();
		DoNotCloseResourceInTry.closeResourceInFinally();
	}
	
	public static void doNotCloseResourceInTry() {
		FileInputStream inputStream = null;
		try {
			File file = new File("./tmp.txt");
			inputStream = new FileInputStream(file);
			
			// use the inputStream to read a file
			
			// do NOT do this
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.err.print(e);
		} catch (IOException e) {
			System.err.print(e);
		}
	}
	
	public static void closeResourceInFinally() {
		FileInputStream inputStream = null;
		try {
			File file = new File("./tmp.txt");
			inputStream = new FileInputStream(file);
			
			// use the inputStream to read a file
			
		} catch (FileNotFoundException e) {
			System.err.print(e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.err.print(e);
				}
			}
		}
	}

}
