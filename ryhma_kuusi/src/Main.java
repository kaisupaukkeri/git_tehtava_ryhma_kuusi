import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello group six!");
		
		//testing constructors
		Car car1 = new Car("Kia", "Rio", 2);
		car1.accelerate();
		car1.brake();
		car1.printData();
	
		
		// Create new object
		Car car = new Car("Toyota", "RAV4", 40);
		
		String answer = "";
		
		// asking for user what to do
		do {
			System.out.println("a=accelerate b=break x=exit");
			answer = in.nextLine();
			if (answer.equals("a")) {
				car.accelerate();
			}
			else if (answer.equals("b")) {
				car.brake();
			}
			else if (answer.equals("x")) {
				break;
			}
		
		} while (!(answer.equals("x")));
	}

}// Main class ends

class Car {
	//Atributes
	String brand;
	String model;
	int amountOfFuel;
	
	//Default constructor
	Car() 
	{
	    brand = "";
	    model = "";
	    amountOfFuel = 0;
	}
	
	//Parameterized constructor
	Car(String b, String m, int f)
	{
	    brand = b;
	    model = m;
	    amountOfFuel = f;
	}
	
	//Methods
	public void brake() {
		//Code here
		System.out.println("Car is breaking");
	}
	
	public void accelerate() {
		   if (amountOfFuel > 0) {
	            System.out.println("Car is accelerating");
	            amountOfFuel--;
	        } 
	}
	
	public void printData() {
		System.out.println("Brand: " + brand + ".");
		System.out.println("Model: " + model + ".");
		System.out.println("Fuel: " + amountOfFuel + " litres.");
		//Code here
		//Prints Car class data
	}
	
}
