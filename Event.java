 class Event {
	 private String eventDescription;
	 private int eventScore;
	
	//Constructor
	public Event() {
		
	}
	public Event(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public Event(int eventScore) {
		this.eventScore = eventScore;
	}
	public Event(String eventDescription, int eventScore) {
		this.eventDescription = eventDescription;
		this.eventScore = eventScore;
	}
	//Accessor and Mutator
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public int getEventScore() {
		return eventScore;
	}
	public void setEventScore(int eventScore) {
		this.eventScore = eventScore;
	}
	@Override
	public String toString() {
		return eventDescription;
	}
	
}
