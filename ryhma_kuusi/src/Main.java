public class Main {
    public static void main(String[] args) {
        System.out.println("Hello group six!");
        String answer = "";
        Vehicle chosenVehicle = null;
        String askedParameters[] = {"Give brand","Give model","Give amount of fuel you have"};
        String collectedParameters[] = {"brand", "model", "amount of fuel"};

        // Asking for the user to choose the type of vehicle from choices given and give it parameters.
        while (true) {
            System.out.println("Choose your vehicle. Press c for car and b for boat and x to exit");
            answer = Functions.getInputString();
            if (answer.equalsIgnoreCase("x")) {
            	break;
            }
            else if (answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("b")) {
                if (answer.equalsIgnoreCase("c")) {
                    System.out.println("You Step into a car that is standing still in the parking lot.");
                    chosenVehicle = new Car();
                } else {
                    System.out.println("You step into a boat that is standing still in marina.");
                    chosenVehicle = new Boat();
                }

                
                for (int i = 0; i < collectedParameters.length; i++) {
                	System.out.println(askedParameters[(i)]);
                    collectedParameters[i] = Functions.getInputString();
                }

                // Assuming you have a setParameters method in your Vehicle abstract class
                chosenVehicle.setParameters(collectedParameters);
            }

            // Asking for the user what to do
            System.out.println("");
            do {
                System.out.println("a=accelerate b=brake or reverse f=refuel p=park or drift s=set maximum speed x=choose vehicle");
                answer = Functions.getInputString();

                // Using the chosenVehicle to perform operations
                if (answer.equalsIgnoreCase("a")) {
                    chosenVehicle.accelerate();
                } else if (answer.equalsIgnoreCase("b")) {
                    chosenVehicle.brake();
                } else if (answer.equalsIgnoreCase("f")) {
                    System.out.println("How many litres do you want to refuel?");
                    int refuelAmount = Functions.getInputValue();
                    chosenVehicle.refuel(refuelAmount);
                } else if (answer.equalsIgnoreCase("p")) {
                    chosenVehicle.park();
                } else if (answer.equalsIgnoreCase("s")) {
                    chosenVehicle.setMaxSpeed();
                } else if (answer.equalsIgnoreCase("x")) {
                    break;
                }
            } while (!(answer.equals("x")));
        }
    }
}