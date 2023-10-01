package demoproject;

public class Car extends Vehicle {
	private int numofDoors;

	public Car(String make, String model, int year,int numofDoors) {
		super(make,model,year);
		this.numofDoors = numofDoors;
	}

	public int getNumofDoors() {
		return numofDoors;
	}

	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("Number of Doors:"  + getNumofDoors());
	}

	

}
