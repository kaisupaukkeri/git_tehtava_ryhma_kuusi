
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello group six!");
		
		//testing constructors
		Car car = new Car("Lada", "Samara", 30);
	}

}// Main class ends

Class Car {
	//Atributes
	String brand;
	String model;
	int amountOfFuel
	
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
	
	printData {
		//Code here
		//Prints Car class data
	}
	
}
