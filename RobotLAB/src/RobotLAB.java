package RobotLAB;
import java.util.Random;
import java.util.Scanner;

public class RobotLAB {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userInput;
		Random gen = new Random();
		int newNum;
		
		System.out.println("Hello, please tell me something about yourself.");
		System.out.println("You can type ‘Goodbye’ at any time to quit.");
		userInput = scan.nextLine();
		
		while(true) {
			newNum = gen.nextInt(3);
			if (newNum == 0) {
				System.out.println("Please explain further.");
				userInput = scan.nextLine();
			} else if (newNum == 1) {
				System.out.println("Why do you say " + userInput + "?");
				userInput = scan.nextLine();
			} else if (newNum == 2) {
				System.out.println("What else can you share?");
				userInput = scan.nextLine();
			}
			if (userInput.equalsIgnoreCase("Goodbye")){
				System.out.println("It was nice talking with you, goodbye.");
				System.out.println("______________________________________");
				break;
			}
			continue;
		}
		
	}

}
