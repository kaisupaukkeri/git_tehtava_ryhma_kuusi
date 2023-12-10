import java.util.Scanner;
public class Functions {
	
	//All methods are owned by this class so there is no need to create objects in classes that use these methods.
	//all of these methods can be used by Functions.(choose your method)();
	//To check if value equals max value 
	static boolean isMaxValue (int max, int compare) {
		boolean answer;
		
		int maxValue = max;
		int compareValue = compare;
		if (compareValue == maxValue) {
			answer = true;
		}
		else {
			answer = false;
		}
		return answer;	
	}
	//To check if value equals minimum value
	static boolean isMinValue (int compare) {
		boolean answer;
		if (compare > 0) {
			answer = false;
		}
		else {
			answer = true;
		}
		return answer;
	}
	//Used to read value from user input and set it as new value
	static int getInputValue() {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int value = Integer.parseInt(input);
		return value;
	}
	
	
	static String getInputString() {
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		return answer;
	}
}

