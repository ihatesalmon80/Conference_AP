import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

//testing read file
public class Tester {
	
	public static void main(String[] args) {
		File names = new File("names.csv");
		ReadFile r1 = new ReadFile();
		r1.readFile(names);
		
	}
}
