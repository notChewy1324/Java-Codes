import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		
		//Create Scanner
		Scanner scan = new Scanner(System.in);
		
		String a_name, adjective1, a_thing, a_thing2, animal1, verb1, verb2, adjective2, num1, adjective3, animal2, a_name2, thing;
		
		System.out.println("Enter a name: ");
		a_name = scan.nextLine();
		
		System.out.println("Enter an adjective: ");
		adjective1 = scan.nextLine();
		
		System.out.println("Enter a thing (item): ");
		a_thing = scan.nextLine();
		
		System.out.println("Enter another thing (item): ");
		a_thing2 = scan.nextLine();

		System.out.println("Enter an animal: ");
		animal1 = scan.nextLine();
		
		System.out.println("Enter a verb: ");
		verb1 = scan.nextLine();
		
		System.out.println("Enter another verb: ");
		verb2 = scan.nextLine();
		
		System.out.println("Enter an adjective: ");
		adjective2 = scan.nextLine();
		
		System.out.println("Enter a number: ");
		num1 = scan.nextLine();
		
		System.out.println("Enter an adjective: ");
		adjective3 = scan.nextLine();
		
		System.out.println("Enter an animal: ");
		animal2 = scan.nextLine();
		
		System.out.println("Enter a name: ");
		a_name2 = scan.nextLine();
		
		System.out.println("Enter a thing (item): ");
		thing = scan.nextLine();
		
		System.out.println(a_name + " the squirrel had just climbed up the " + adjective1 + " \n tree. It was the first day of autumm and time to gather as many " + 
		a_thing + " and " + a_thing2 + " for winter feasting. Chester the " + animal1 + " \n asked his squirrel friend to take a break and join him for a little " + 
		verb1 + " and " + verb2 + ". \n The two buddies had so much fun but squirrel really needed to finish his gathering. He returned to his " + adjective2 + " home to find that " + num1 + adjective3 + animal2 + " were waiting for him to go to the fall festival party at " + a_name2 + " house. \n Squirrel realized that there wasn't going to be any more work that day. Today had been fun but tomorrow he'd need to collect more " + thing + " for the winter.");
	}

}
