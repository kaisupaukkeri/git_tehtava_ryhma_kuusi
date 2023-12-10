
public class Car extends Vehicle {
	
	//Methods used in class that are separated for general use and inherited from Vehicle which inherits it from Functions class
//	Functions valueChecker = new Functions();
    //Attributes inherited from abstract Vehicle class
	//Default constructor
	
	Car() 
	{
	    brand = "";
	    model = "";
	    amountOfFuel = 0;
	    //Speed is not set by user but is manipulated by accelerate and brake methods.
	    //Default is always 0 = car is not moving.
	    speed = 0;
	    //By default car can accelerate 3 times before it has to brake to accelerate again
	    maxSpeed = 3;
	    //Boolean value to check if vehicle is at max speed
	    isMaxSpeed = false;
	    //Boolean value to check if vehicle is not moving. By default car is at standstill.
	    isStopped = true;
	}
	
	//Parameterized constructor
	Car(String b, String m, int f)
	{
	    brand = b;
	    model = m;
	    amountOfFuel = f;
	    //Speed is not set by user but is manipulated by accelerate and brake methods.
	    //Default is always 0 = car is not moving.
	    speed = 0;
	    //By default car can accelerate 3 times this is manipulated with setMaxSpeed method
	    maxSpeed = 3;
	    //Boolean value to check if vehicle is at max speed
	    isMaxSpeed = false;
	    //Boolean value to check if vehicle is not moving. By default car is at standstill.
	    isStopped = true;
	}
	
	///Mandatory methods inherited from Vehicle
	//To set parameters from list collected from user input
	public void setParameters(String[] parameters) {
		this.brand = parameters[0];
		this.model = parameters[1];
		this.amountOfFuel = Integer.parseInt(parameters[2]);
	}
	 
	public void brake() {
		//To check if car has already stopped
		isStopped = Functions.isMinValue(speed);
		
			if (isStopped == false) { 
				System.out.println("Car is braking");
				speed --;
			}
			else  {
				System.out.println("Car is reversing");
				amountOfFuel --;
			}
	}
	
	public void accelerate() {
		//To check if max speed is already achieved
		isMaxSpeed = Functions.isMaxValue(maxSpeed,speed);
		
			if (isMaxSpeed == false && amountOfFuel > 0) {
	            System.out.println("Car is accelerating");
	            amountOfFuel--;
	            speed ++;
			}
			else if (isMaxSpeed == false && amountOfFuel == 0) {
		        System.out.println("You are out of fuel. Enter f to refuel.");
		        
			} else {
				System.out.println("Max speed already! Brake to accelerate again.");
			}

	        
	}
    public void refuel(int refuel) {
    	System.out.println("Fuel in the tank: " + amountOfFuel);
    	System.out.println("Refuel: " + refuel);
    	amountOfFuel = amountOfFuel + refuel;
    	System.out.println("Fuel in the tank after the refuel: " + amountOfFuel);
    	System.out.println();
    }
    
	public void printData() {
		System.out.println("Brand: " + brand + ".");
		System.out.println("Model: " + model + ".");
		System.out.println("Fuel: " + amountOfFuel + " litres.");
		//Code here
		//Prints Car class data
	}
	public void setMaxSpeed(){
		System.out.println("Give new max speed.");
		maxSpeed = Functions.getInputValue();
	}
	
	//Park method to park by pulling hand brake
	public void  park() {
		if (speed == 0) {
			System.out.println("You have pulled the hand brake and parked the car");
		}
		else {
			System.out.println("You are drifting");
		}
	}
	//Requires speed to be 0.
	//Code here
}
	
