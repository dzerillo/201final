class Student {
	String firstName;
	String lastName;
	
	//Constructor
	public Student() {
		
	}
	public Student (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Accessor and Mutator
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
