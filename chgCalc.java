import java.util.Scanner;
import java.lang.Math;

public class chgCalc {

	public static void main(String[] args) {
		System.out.print("Welcome to the Change Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int change;
		
		while(choice.equalsIgnoreCase("y")) {
			
			//Get User Input
			System.out.print("Enter number of cents (0-99): ");
			change = sc.nextInt();
			
			//Declare and Initialize Coins 
			int quarters = Math.round((int)change/25);
			change=change%100;
			int dimes = Math.round((int)change/10);
			change=change%25;
			int nickels = Math.round((int)change/5);
			change=change%5;
			int pennies = Math.round((int)change/1);
			change=change%1;
			
			String message = "Quarters: " + quarters + "\n" +
					          "Dimes: " + dimes + "\n" +
					          "Nickels:  " + nickels + "\n" +
					          "Pennies: " + pennies + "\n";
			
			System.out.print(message);
			System.out.println();
			
			System.out.print("Continue (y/n): ");
			choice = sc.next();
			System.out.println();
			
		}

	}

}
