import java.util.Random;

public class randomGrade {
	  
	public static void main(String []args) {
		Random rand = new Random();
		char c = (char) (rand.nextInt(6) + 'b');
		
		System.out.println(c);
	
		int min = 55;
		int max = 89;
				
		int randomGrade = ((int)Math.random()*((max-min)+1))+min;
		
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
	}

}
