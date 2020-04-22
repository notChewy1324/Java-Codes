import java.util.Random;
import java.util.Scanner;

public class RandomGuessLAB {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int newNum, userText;
		Random gen = new Random();
		newNum = gen.nextInt(20);
		
		
		System.out.println("Guess the number! Enter value between 1-20: ");
		userText = scan.nextInt();
		
		while(userText != newNum) {
			if (userText < newNum) {
				System.out.println("Your guess is too low. Guess again: ");
				userText = scan.nextInt();
			} else if (userText > newNum) {
				System.out.println("Your guess is too high. Guess again: ");
				userText = scan.nextInt();
			}
		}
		
		if (userText == newNum) {
				System.out.println("Congratulations! You guessed the number right! \n The answer was " + newNum);
		}
	}

}
