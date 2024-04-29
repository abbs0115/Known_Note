// import the utility library
import java.util.*;
// A class which asks the user for an  order (cup of coffee) and it prints out what the user pordered
// as well as the price and how much they owe

class CoffeeShop {

	public static void main(String[] args) {

		// Get user input for a name
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome, what is your name?");

		// Strings require a data type to be instantiated
		// Strings have positions for their characters

		String name = s.nextLine();
		// nextLine() prompts the user to type in the terminal

		//Concatenate strings by adding them together
		String response = "";
		response = "Hello " + name + "!";
		System.out.println(response);

		System.out.println("1. Coffee with carmamel\n 2. Energy drink");
		// \n = new line (vertical list)

		// Get an order from the user
		System.out.println("What would you like to order?");

		String order = s.nextLine();

		System.out.println("Here, your " + order + " is ready!");

		// Check to see what is in the order
		for (int i = 0; i < order.length() - 2; i++) {

			String sub = order.substring(i, i+3);

			if(sub.equals("tea")) {
				System.out.println("That tea will cost you $4.00");
			}

			if (sub.equals("cof")) {
				System.out.println("That coffee will cost you $6.00");
			}

			if (sub.equals("wat")) {
				System.out.println("That water is free!");
			}
		}
	}
}