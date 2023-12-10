//Abstract class for vehicle-type classes to inherit
abstract class Vehicle extends Functions {
	//Parameters that are inherited
	protected String brand;
	protected String model;
	protected int amountOfFuel;
	protected int speed;
	protected int maxSpeed;
	protected boolean isMaxSpeed;
	protected boolean isStopped;
	
	//Must have methods for any class inheriting this class
	//Basic functionalities of any vehicle
	abstract void accelerate();
	abstract void brake();
	//To set max speed for the car
	abstract void setMaxSpeed();
	//If the vehicle runs out of fuel, they can refuel it
	abstract void refuel(int fuelamount);
}
