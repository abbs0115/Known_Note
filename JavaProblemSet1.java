import java.util.*;

class JavaProblemSet1 {
/*
	// Problem 1: greetings
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("What is your name?");

		
		String name = s.nextLine();
		
		String response = "";
		response = "Hello " + name + ", it is nice to meet you!";
		System.out.println(response);

	}
*/
	
	// Problem 2: isTriangle
	public static boolean isTriangle(int a, int b, int c) {
		// Public = an access modifier used for classes
		// Static = it belongs to the class, rather than a specific instance.
		if (a + b > c) {
		    if (a + c > b) {
		    	if (b + c > a) {
		        	return true;
		        }
		    }
		}
		return false;
	}

	public static void main(String[] args) {
		if (isTriangle(5, 7, 8)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		  }
	}

/*	
	// Problem 3: temperature
	    public static String temperature(float value, boolean isFahrenheit) {
	        if (isFahrenheit) {
	            float celsius = (value - 32) * 5 / 9;
	            return "It is " + celsius + " degrees Celsius";
	        } else {
	            float fahrenheit = (value * 9 / 5) + 32;
	            return "It is " + fahrenheit + " degrees Fahrenheit";
	        }
	    }

	    public static void main(String[] args) {
	        boolean temp = true; // Assuming this is your condition

	        if (temp) {
	            // Fahrenheit to Celsius
	            float fahrenheitTemp = 68;
	            String result = temperature(fahrenheitTemp, true);
	            System.out.println(result);
	        } else {
	            // Celsius to Fahrenheit
	            float celsiusTemp = 20;
	            String result = temperature(celsiusTemp, false);
	            System.out.println(result);
	        }
	    }
*/
}