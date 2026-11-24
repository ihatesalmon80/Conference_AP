import java.util.Scanner;

/*class that creates large, combined array of all 100 attendees
 * takes pre-known 90 from other attendee class
 * asks for 10 manually inputted ones
 */
public class AttendeesTotal {
	
	private Attendee[] allAttendees = new Attendee[100];
	
	public AttendeesTotal(Attendee[] preReg) { //in the tester or whatever the preReg array would be the return of ReadFile.java
		
		for (int i = 0; i < preReg.length; i++) {
			allAttendees[i] = preReg[i];
		}
		addAttendees();
		
	}
	/*allows user to manually add last two attendees
	 *scanner prompts each identifier about the attendee
	 *first name, last name, company id
	 *adds 10 attendees to array with other 90
	 */
	public void addAttendees() {
		Scanner scan = new Scanner(System.in);
		for (int j = 0; j < 10; j++) {
			System.out.print("Enter first name:");
			String firstName = scan.nextLine();
			System.out.print("Enter last name:");
			String lastName = scan.nextLine();
			System.out.print("Enter company ID:");
			int coID = scan.nextInt();
			scan.nextLine(); //buffer
			
			allAttendees[j+90] = new Attendee(firstName + " " + lastName, coID);
		}
	}
	
	public Attendee[] getAttendees() {
		return allAttendees;
	}
	
}
