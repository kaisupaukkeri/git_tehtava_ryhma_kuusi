import java.util.Scanner;
public class Functions {
	
	//To check if values meets max or tries to over max value
	
	public boolean isMaxValue (int max, int compare) {
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
	
	public boolean isMinValue (int compare) {
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
	public int getInputValue() {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int value = Integer.parseInt(input);
		return value;
	}
}

