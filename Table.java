// Made up of a collection of Attendees
// May be considered superfluous but good practice
// a table of attendee objects 
// getters and setters?  Constructor?  Parameters?
//Does it matter if you load information first?  then seat?
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class Table {
	
public static void main(String[] args) { 
	File names = new File("names.csv");
	ReadFile r1 = new ReadFile();
	Attendee[] preReg = r1.readFile(names);
	AttendeesTotal allAttendees = new AttendeesTotal(preReg);
	//public Table() {
	//}
	
	//public String[] makeTable() {
	//	return "";
	//}
}

}
