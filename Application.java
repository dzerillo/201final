import java.util.*;

public class Application {
	public static void main(String[] args) {
		int day = 14;
			
		//Creating Student with First Name and Last Name
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you first name");
		String firstName = input.next();
		System.out.println("Please enter you last name");
		String lastName = input.next();
		Student student = new Student(firstName, lastName);
		
		//Need to assign Random Grade to the student
		
		//Creating  Event Array List by 14 * 2
		Event [] [] summaryEvent = new Event[14] [2];
		
		while(day > 0) {
			System.out.println("The number of days to Final Week is " + day);
			System.out.println("Please choose the following events" + 
					"you plan to do for the day" +
					"by entering 1, 2,3,4");
			System.out.println("1. Meet the TA at office hours");
			System.out.println("2. Catch up with your bestfriend over lunch");
			System.out.println("3. Grab luch togo and meet you classmates for study group");
			System.out.println("4. Make yourself comfortable on the couch for a Netflix marthon");
			
			int caseNumber = input.nextInt();
			
			switch(caseNumber) {
			case 1:
				summaryEvent[14 - day][0] = new Event("Meet the TA at office hours");
				summaryEvent[14 - day][1] = new Event(3);
				break;
				      
			case 2:
				summaryEvent[14 - day][0] = new Event("Catch up with your bestfriend over lunch");
				summaryEvent[14 - day][1] = new Event(-1);
				break;
				
			case 3:
				summaryEvent[14 - day][0] = new Event("Grab luch togo and meet you classmates for study group");
				summaryEvent[14 - day][1] = new Event(2);
				break;
				
			case 4:
				summaryEvent[14 - day][0] = new Event("Make yourself comfortable on the couch for a Netflix martho");
				summaryEvent[14 - day][1] = new Event(-2);
				break;
		
			}
			day--;
		}
		System.out.println("Gook luch with your finals tommorrow");
		System.out.println("The following is your list of actions to prepare for the final");
		//Printing the list of events
		for(int i = 0; i < summaryEvent.length; i++) {
			for(int j = 0; j < summaryEvent[i].length; j++) {
			System.out.println(summaryEvent[i][j]);	
			}
			
		}
		
		
	}

}
