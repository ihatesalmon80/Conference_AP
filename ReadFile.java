import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class ReadFile {
  public void readFile(File myObj) {
	//File myObj = new File("filename.txt");
    // try-with-resources: Scanner will be closed automatically

    //String[] data;
    try (Scanner myReader = new Scanner(myObj)) {
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arrAttend = data.split(",");
        //array of strings
        //for each line, send the data to the attendee, convert elements to proper type
        //int coID = Integer.parseInt(arrAttend[coID])
					
        System.out.println(arrAttend);
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    //data = new String[lineCount];
  //  return data;
  }
}
