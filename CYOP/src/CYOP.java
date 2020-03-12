import java.util.Scanner;
import java.text.*;

public class CYOP {

	public static void main(String[] args) {
		
		//Stuff
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###,###.00");
		
		String userName, userPassword;
		int userMoney, userAge;
		
		System.out.println("Enter your name: ");
		userName = scan.nextLine();
		
		System.out.println("Enter your google password: ");
		userPassword = scan.nextLine();
		
		System.out.println("Enter your age: ");
		userAge = scan.nextInt();
		
		System.out.println("Enter all of your money: ");
		userMoney = scan.nextInt();
		
		int age = userAge * 32;
		
		System.out.println("You have been hacked!");
		System.out.println("I have all your money: " + money.format(userMoney));
		System.out.println("I have changed your age to: " + age + " yrs old!");
	}
}
