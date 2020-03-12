import java.util.Scanner;

public class DaysOldInput {

	public static void main(String[] args) {
		
		//Create Scanner
		Scanner scan = new Scanner(System.in);
		
		//Ask User For Age
		byte myAge;
		System.out.println("Please enter your age: ");
		myAge = scan.nextByte();
		
		//Varibles
		int dayAge = myAge * 365;
		int hoursAge = dayAge * 24;
		long minutesAge = hoursAge * 60;
		long secondsAge = minutesAge * 60;
		
		//Outputs
		System.out.println("My age is " + myAge + ".");
		System.out.println("I am " + dayAge + " days old.");
		System.out.println("I am " + hoursAge + " hours old.");
		System.out.println("I am " + minutesAge + " minutes old.");
		System.out.println("I am " + secondsAge + " seconds old.");
	}

}
