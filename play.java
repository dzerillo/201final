
import java.util.ArrayList;
import java.util.Scanner;

public class play {
	public static void main(String[] args) {
		
		ArrayList<Events> actionsMade = new ArrayList<Events>(14);
		
ArrayList<Events> positiveChoices = new ArrayList<Events>();
		
		positiveChoices.add( new Events("Meet the TA for office hours.", 3, "The TA got a glimpse of the exam "
				+ "and gave you tips on "
				+ "what you should study extra hard for.\n\n\n\n\n"));
		
		positiveChoices.add( new Events("Grab lunch togo and meet your classmates for study group.", 2, 
				"The library was packed and you couldn't get a white board, but "
				+ "several of your classmates \nhad talked to the professor and passed on a "
				+ "few study tips.\n\n\n\n\n"));
		
		positiveChoices.add(new Events("Stay home making flash cards.", 1, "The temptation to turn on Disney+ was "
				+ "stong but you managed to make some flash cards. Be sure to use them.\n\n\n\n\n"));
		
		positiveChoices.add(new Events("Find a quiet corner in at Starbucks to read.", 2, 
				"Between people watching and your phone reading was hard but you got through "
				+ "a couple of chapters in the textbook.\n\n\n\n\n"));
		
		positiveChoices.add(new Events("Go see the professor if there was any possibility for extra credit", 2,
				"No extra credit, but you are allowed to turn in late assignments for partial credit."
				+"\n\n\n\n\n"));
		
		positiveChoices.add( new Events( "Email the professor to see if there is an exam from last"
				+ " semester they could share.", 3, "No dice on the exam, but they still answered a few questions "
						+ "you had on the material.\n\n\n\n\n" ));
		
		positiveChoices.add( new Events("Meet with your friend to study together.", 2, "It's nice when "
				+ "you have smart friends to study with.\n\n\n\n\n"));
		
		positiveChoices.add( new Events("Ask your bestfriend's older sister's ex for their old notes.", 1, 
				"They have terrible handwritting and it's obvious they didn't show up very often but you "
				+ "managed to piece a few things together.\n\n\n\n\n"));
		
		positiveChoices.add( new Events("Redo the your worst labs to see if you can do better.", 2, 
				"Understanding became easier your second time around.\n\n\n\n\n"));
		
		positiveChoices.add( new Events("Open Youtube and watch all the Java tutorials you can find.", 2,
				"Some of these videos look and sound like they were produced from a cave in 1960,"
				+ "but there were some pearls of wisdom in there.\n\n\n\n\n"));
		
		positiveChoices.add(new Events("Google 'How to Java' and click the first link that pops up.", 1,
				"Stanford was the first hit, but it was for the course sylabus from two years ago."
				+ " I guess it's usefull.\n\n\n\n\n"));
		
		positiveChoices.add( new Events("Head to the library for some quiet study time.", 3, 
				"Time away from the distractions of home was time well spent.\n\n\n\n\n"));
		
		positiveChoices.add( new Events("Reread your notes from class.", 1, 
				"You really have to work on your penmanship: tilt your head and squint to decipher"
				+ " your hieroglyphs.\n\n\n\n\n"));
		
		positiveChoices.add( new Events("Take a look at the class notes posted on the course website.", 2,
				"Good choice, but why didn't you just write this down during class?\n\n\n\n\n"));
		
		positiveChoices.add( new Events( "Email the TA a few questions.", 2, "They suggested emailing the "
				+ "professor but were able to answer all your questions.\n\n\n\n\n"));
		
		positiveChoices.add( new Events( "Redo the questions you got wrong on the first midterm.", 3,
				"Sometimes you have to look at things twice for a flash of genius.\n\n\n\n\n"));
		
		positiveChoices.add(new Events( "Look at the study guide handed out durning class.", 2,
				" It was crumpled up at the bottom of your backpack but you have it to study with.\n\n\n\n\n"));
		
		positiveChoices.add( new Events("Pull an all-nighter in the library.", 3, "Walking around like a zombie"
				+ " the next day will be worth it. \n\n\n\n\n" ));
		
		
		
		ArrayList<Events> negativeChoices = new ArrayList<Events>();
		
		
		negativeChoices.add(new Events("Catch up with your bestfriend over lunch.", -1,
				"Your best friend was late for lunch, but the food was "
						+ "really good and you learned all about their family vacation.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("Make yourself comfortable on the couch for a Netflix marathon.", -2,
				"Netflix is removing your favorite show next month! Better binge all 11 seasons.\n\n\n\n\n"));
		
		negativeChoices.add( new Events("Clean your apartment.", -1,
				"Your place is spotless, too bad you couldn't study at the same time.\n\n\n\n\n"));
		
		negativeChoices.add( new Events("The book you ordered from amazon came in. Finish it in one day!", -1,
				"Book read. You can't wait for the movie.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("Catch a movie with your siblings.", -2,
				"It's official: There isn't a part Leo DiCaprio isn't made for.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("Go to the bar with your roommate.", -3,
				"You love tequila, tequila hates you.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("Your favorite band is in town: head out to the their concert.", -3,
				"After their third encore you were covinced this was the show of a life time. \n\n\n\n\n"));
		
		negativeChoices.add(new Events("Your manager asked if you can come in early: do you go in?", -1,
				"Why not? he's not a bad guy and you could use the extra money.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("You're going to Vegas for your birthday so you why not try to learn "
				+ "how to count cards now?", -2, "You're confident now but just wait until you loose all of"
						+ " your vacation money waiting 'for the deck to heat back up',\n\n\n\n\n"));
		
		negativeChoices.add(new Events("You found a weird scab on your elbow: better go on webMD.", -2,
				"Good news: you aren't gonna lose your arm. \nBad news: you have the plague, small pox, polio"
				+ ", and heart disease.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("Find out what your best friend from 1st grade doing.", -2,
				"You can't believe how many Tim Smiths there are out there but it's possible your friend is"
				+"\neither in prison, or the Mayor of a town in rural Canada.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("You haven't googled yourself in a while...", -1, 
				"Apparently you died."));
		
		negativeChoices.add(new Events("Turn on the TV. Just for an hour.", -2,
				"It's been three hours and you're still yell answers at Alex Trebek.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("The is a karaoke night at the bar down the street and you think"
				+ " what could be more motivating\nthan killing 'Living on a Prayer'?", -3,
				"Three people sung the same song before you, and you still didn't sound that great."));
		
		negativeChoices.add(new Events("Spend all day baking delicious treats!", -1,
				"Your bownies were alright, but you bunt your cookies.\n\n\n\n\n"));
		
		negativeChoices.add(new Events("Go shopping for a new shirt for your date Saturday.", -2,
				"Your bank account is begging for a break.\n\n\n\n\n"));
		
		int playing = 1;
		
		while (playing > 0) {
			
		    Scanner myName = new Scanner(System.in);
		    
		    System.out.println("Enter name");

		    // String input
		    String name = myName.nextLine();


		    // Output input by user
		    System.out.println("Name: " + name +"\n\n" );
		    
		    //Calculating Starting grade
		    int min = 55;
			int max = 90;
					
			int randomGrade = (int)(Math.random()*((max-min)+1))+min;
			System.out.println(randomGrade);
			
			if (randomGrade < 59) {
				
				System.out.println("Your starting grade is an F.");
			}
			
			if (randomGrade > 59) {
				if (randomGrade < 69) {
					
					System.out.println("Your starting grade is a D.");
					
				}
			}
			
			if (randomGrade > 69) {
				if (randomGrade < 79) {
					
					System.out.println("Your starting grade is a C.");
					
				}
			}
			
			if (randomGrade > 79) {
				if (randomGrade < 89) {
					
					System.out.println("Your starting grade is a B.");
				}
			}
		    
			int finalGrade = 0;
			
			
			
			for (int i = 0; i < 14; i++) {
				
				int firstPositiveChoice;
				firstPositiveChoice = (int)Math.floor(Math.random()* positiveChoices.size());
				
				int secondPositiveChoice;
				secondPositiveChoice = (int)Math.floor(Math.random()* positiveChoices.size());
				
				int firstNegativeChoice;
				firstNegativeChoice = (int)Math.floor(Math.random()* negativeChoices.size());
				
				int secondNegativeChoice;
				secondNegativeChoice = (int)Math.floor(Math.random()* negativeChoices.size());
				
				System.out.println("It's a new day! What are you gonna do? (Pick 1, 2, 3 or 4)\n\n\n"
						+ "1. " + positiveChoices.get(firstPositiveChoice).event
						+ "\n2. " + negativeChoices.get(firstNegativeChoice).event
						+ "\n3. " + positiveChoices.get(secondPositiveChoice).event
						+ "\n4. " + negativeChoices.get(secondNegativeChoice).event
						+ "\n-1 to exit\n\n\n");
				
				Scanner pick = new Scanner(System.in);
				int choice = pick.nextInt();
				
				if ( choice == 1) {
					
					System.out.println("\n\n" + positiveChoices.get(firstPositiveChoice).outcome);
					actionsMade.add(positiveChoices.get(firstPositiveChoice));
				}
				
				if ( choice == 2) {
					
					System.out.println("\n\n" + negativeChoices.get(firstNegativeChoice).outcome);
					actionsMade.add(negativeChoices.get(firstNegativeChoice));
				}
				
				if ( choice == 3) {
					
					System.out.println("\n\n" + positiveChoices.get(secondPositiveChoice).outcome);
					actionsMade.add(positiveChoices.get(secondPositiveChoice));
				}
				
				if ( choice == 4) {
					
					System.out.println("\n\n" + negativeChoices.get(secondNegativeChoice).outcome);
					actionsMade.add(negativeChoices.get(secondNegativeChoice));
				}
				
				if (choice == -1) {
					for (int k = 0; k<actionsMade.size();k++) {
						
						finalGrade += (int)actionsMade.get(k).eventValue;
					}
					
					if (  finalGrade <= 59 ) {
						System.out.println("Your final grade is an F. Should've hit the books harder.");
					}
					if (finalGrade <= 69) {	
						if (finalGrade > 69) {
							System.out.println("Your final grade is a D. Have fun in summer school.");
						}
					}
					if (finalGrade <= 79) {	
						if (finalGrade > 69) {
							System.out.println("Your final grade is a C. Not good enough.");
						}
					}
					if (finalGrade <= 89) {	
						if (finalGrade > 79) {
							System.out.println("Your final grade is a B. You couldn't get an A?");
						}
					}
					if (finalGrade > 89) {	
						System.out.println("Your final grade is an A. Your spot in the library will miss you next semester.");
					}
					
					playing = -1;
					
					
				}
				
			}
			
				for (int k = 0; k<actionsMade.size();k++) {
			
					if (  finalGrade <= 59 ) {
						System.out.println("Your final grade is an F. Should've hit the books harder.");
					}
					if (finalGrade <= 69) {	
						if (finalGrade > 69) {
							System.out.println("Your final grade is a D. Have fun in summer school.");
						}
					}
					if (finalGrade <= 79) {	
						if (finalGrade > 69) {
							System.out.println("Your final grade is a C. Not good enough.");
						}
					}
					if (finalGrade <= 89) {	
						if (finalGrade > 79) {
							System.out.println("Your final grade is a B. You couldn't get an A?");
						}
					}
					if (finalGrade > 89) {	
						System.out.println("Your final grade is an A. Your spot in the library will miss you next semester.");
					}
				}
				playing = -1;
		}
	}

}
