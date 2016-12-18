package collection;

public class Factory {
	private String steering;
	private String seat;
	private String tires;
		
	public void drive(){
		System.out.println("Steering:"+ this.steering +" Seat:"+ this.seat +" Tires:"+ this.tires);
	}



	public String getTires() {
		return tires;
	}



	public void setTires(String tires) {
		this.tires = tires;
	}



	public String getSeat() {
		return seat;
	}



	public void setSeat(String seat) {
		this.seat = seat;
	}



	public String getSteering() {
		return steering;
	}



	public void setSteering(String steering) {
		this.steering = steering;
	}
	
	public static void main(String[] arg){
		Factory fact	=	new Factory();
		fact.setSteering("Left Steer");
		fact.setSeat("4 Seat");
		fact.setTires("4 Tires");
		
		fact.drive();
	}
}
