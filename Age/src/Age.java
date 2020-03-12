
public class Age {

	public static void main(String[] args) {
		//Vars
		byte myAge = 75;
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
