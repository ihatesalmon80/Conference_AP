/* This class file will represent a person attending the Event
  * Consider the company or organizxation they belong to
  * Consider Name, Table, Seat Number and other data that may be populated
  * during the data load itself, or during the method that places people at their seats.
  */

// Attendee.java     Date: __________________
// @Author ___________________________

public class Attendee {
	
	private String name;
	private int table;
	private int seatNum;
	private int company;
	
	public Attendee(String initName, int initCoId) {
		
		name = initName;
		company = initCoId;
		
	}
	
	public String getName() {
		return name;
	}
	
	//rest of getters
	
	public void setTable(int t) {
		table = t;
	}
	
	
}
  
