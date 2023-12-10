
public class Boat extends Vehicle { 
	
	//Methods used in class that are separated for general use and inherited from Vehicle which inherits it from Functions class
	Functions valueChecker = new Functions();
    //Attributes inherited from abstract Vehicle class
	//Default constructor
	
	//Default constructor
	Boat() 
	{
	    brand = "";
	    model = "";
	    amountOfFuel = 0;
	    //Speed is not set by user but is manipulated by accelerate and brake methods.
	    //Default is always 0 = car is not moving.
	    speed = 0;
	    //By default boat can accelerate 3 times before it has to slow brake to accelerate again
	    maxSpeed = 3;
	    //Boolean value to check if vehicle is at max speed
	    isMaxSpeed = false;
	}
	
	//Parameterized constructor
	Boat(String b, String m, int f)
	{
	    brand = b;
	    model = m;
	    amountOfFuel = f;
	}
	

	//Mandatory methods inherited from Vehicle
	public void accelerate() {
		//To check if max speed is already achieved
		System.out.println("Boat is accelerating");
		amountOfFuel--;
	}


	public void brake() {		
		System.out.println("Boat is slowing down");	
	}

	
	//If the boat runs out of fuel, they can refuel it 
    public void refuel(int refuel) {
    	System.out.println("Fuel in the tank: " + amountOfFuel);
    	System.out.println("Refuel: " + refuel);
    	amountOfFuel = amountOfFuel + refuel;
    	System.out.println("Fuel in the tank after the refuel: " + amountOfFuel);
    	System.out.println();
    }
    
	//Prints Car class data
    public void printData() {
		System.out.println("Brand: " + brand + ".");
		System.out.println("Model: " + model + ".");
		System.out.println("Fuel: " + amountOfFuel + " litres.");

    }
    
	public void setMaxSpeed() {
		System.out.println("Give new max speed.");
		maxSpeed = valueChecker.getInputValue();
	}
    
	//Class specific method to drop anchor and stop
	public void dropAnchor (){
		System.out.println("Anchor has been dropped,and the boat has stopped coasting.");
	}
	

}

