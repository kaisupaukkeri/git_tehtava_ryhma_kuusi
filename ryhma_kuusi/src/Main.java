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
			System.out.println("a=accelerate b=brake or reverse p=park s=set maxium speed x=exit");
			answer = in.nextLine();
			if (answer.equalsIgnoreCase("a")) {
				car.accelerate();
			}
			else if (answer.equalsIgnoreCase("b")) {
				car.brake();
			}
			else if (answer.equalsIgnoreCase("f")) {
				System.out.println("How many litres do you want to refuel?");
				int refuelAmount = in.nextInt();
				in.nextLine(); //Without this, the app prints the instructions twice after refueling
				car.refuel(refuelAmount);
			}
			else if (answer.equalsIgnoreCase("p")) {
				car.park();
			}
			else if (answer.equalsIgnoreCase("s")) {
				car.setMaxSpeed();
			}
			else if (answer.equalsIgnoreCase("x")) {
				break;
			}
		
		} while (!(answer.equals("x")));
	}

}// Main class ends