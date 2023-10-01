package demoproject;

public class Motorcycle extends Vehicle {
	private double topSpeed;

	public Motorcycle(String make, String model, int year, double topSpeed) {
		super(make, model, year);
		this.topSpeed = topSpeed;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("TopSpeeds:" + getTopSpeed());
	}
	
}
