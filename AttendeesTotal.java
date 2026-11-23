import java.util.Scanner;

public class AttendeesTotal {
	
	private Attendee[] allAttendees = new Attendee[100];
	
	public AttendeesTotal(Attendee[] preReg) {
		
		for (int i = 0; i < preReg.length; i++) {
			allAttendees[i] = preReg[i];
		}
		
	}
	
	public void addAttendees(Scanner scan) {
		for (int j = 0; j < 10; j++) {
			System.out.println("Enter first name:");
			String firstName = scan.nextLine();
			System.out.println("Enter last name:");
			String lastName = scan.nextLine();
			System.out.println("Enter company ID:");
			int coID = scan.nextInt();
			scan.nextLine(); //buffer
			
			allAttendees[j+90] = new Attendee(firstName + " " + lastName, coID);
		}
	}
	
}
