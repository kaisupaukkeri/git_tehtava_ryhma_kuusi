
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello group six!");
		
		//testing constructors
		Car car = new Car("Lada", "Samara", 30);
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
	    printData();
	}
	
	//Parameterized constructor
	Car(String b, String m, int f)
	{
	    brand = b;
	    model = m;
	    amountOfFuel = f;
	    printData();
	}
	
	//Methods
	brake() {
		//Code here
	}
	
	accelerate() {
		//Code here
	}
	
	public void printData() {
		System.out.println("Brand: " + brand + ".");
		System.out.println("Model: " + model + ".");
		System.out.println("Fuel: " + amountOfFuel + " litres.");
		//Code here
		//Prints Car class data
	}
	
}
