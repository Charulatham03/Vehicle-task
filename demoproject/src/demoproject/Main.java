package demoproject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("camry","toyota",2019,4);
		System.out.println("Car Info:" );
		car.displayInfo();
		System.out.println("------------------");
		
		Motorcycle motorcycle  = new Motorcycle("Honda","dio",2019,4);
		System.out.println("Motorcycle  Info:" );
	    motorcycle.displayInfo();

		

	}

}
