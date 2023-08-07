package LearnNonBddAPIAutomation;

public class MethodChaining {
	
	String place;
	String modeoTravel;
	
	//Right click -> source -> generate geterrs and setters

	public String getPlace() {
		return place;
	}

	public MethodChaining setPlace(String place) {
		this.place = place;
		return this;
	}

	public String getModeoTravel() {
		return modeoTravel;
	}

	public MethodChaining setModeoTravel(String modeoTravel) {
		this.modeoTravel = modeoTravel;
		return this;
	}
	
	public void WhereAreyouGoing() {
		
		System.out.println(getPlace());
		
		System.out.println("Oh jolly ah"+ getModeoTravel() + "la " + getPlace() +"poriya");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodChaining chaining =  new MethodChaining();
		chaining.setPlace("Buffallo");
		chaining.setModeoTravel("Bike");
		chaining.WhereAreyouGoing();
		
		chaining.setPlace("Denver").setModeoTravel("Flight").WhereAreyouGoing();
	}

	//Need the Void to class name 
}
