import java.util.Scanner;

public class CentsandChange {

	public static void main(String[] args) {

		//Create Scanner
		Scanner scan = new Scanner(System.in);
				
		//Ask User For Pennies Number
		int pennies;
		System.out.println("How many pennies do you have?: ");
		pennies = scan.nextInt();
		
		int dollars = pennies / 100;
		int dollars1 = pennies % 100;
		
		int quarters = dollars1 / 25;
		int quarters1 = dollars1 % 25;
		
		int dimes = quarters1 / 10;
		int dimes1 = quarters1 % 10;
		
		int nickels = dimes1 / 5;
		int nickels1 = dimes1 % 5;
		
		int cents =  nickels1 / 100;
		int cents1 = nickels1 % 100;
		
		//Display dollars and Cents
		System.out.print("That is " + dollars + " dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + cents1 + " penny(ies).");
	}

}
