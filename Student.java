
public class Student {
	String studentName;
	int happiness;
	int turnsTaken;
	
	//Constructor
	public Student() {
		studentName = " ";
		happiness = 50;
		turnsTaken = 0;
	}
	
	public String getName() {
		return studentName;
	}
	public void setName(String name) {
		this.studentName = name;
	}
	public int getHappiness() {
		return happiness;
	}
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	public int getTurnsTaken() {
		return turnsTaken;
	}
	public void setTurnsTaken(int turnsTaken) {
		this.turnsTaken = turnsTaken;
	}
	
	// Method: Student pick a event
	public static void pickEvent(Events event) {
		
	}
	
}
