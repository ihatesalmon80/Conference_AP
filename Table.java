// Made up of a collection of Attendees
// May be considered superfluous but good practice
// a table of attendee objects 
// getters and setters?  Constructor?  Parameters?
//Does it matter if you load information first?  then seat?
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class Table {

	int tables;
	int seatsPerTable;
	Attendee[][] seatingChart = new Attendee[tables][seatsPerTable];
	
	public Table(int nTables, int nSeats) {
		
		tables = nTables;
		seatsPerTable = nSeats;
		
		int totalSeats = tables * seatsPerTable;
		int lastTableFill = 0;
		
		if (totalSeats > 100) {
			lastTableFill = totalSeats-100;
		}
		else if (totalSeats < 100) {
			System.out.println("Sorry, there are not enough seats!");
			System.exit(0);
		}
		
		for (int i = 0; i < tables; i++) {
			Attendee[] chartPerTable = makeTable();
			seatingChart[i] = chartPerTable;
		}
	}
	
	public Attendee[] makeTable() {
		Attendee one = new Attendee("hi", 2);
		Attendee two = new Attendee("hello",3);
		Attendee[] test = {one, two};
		return test;
	}
}


