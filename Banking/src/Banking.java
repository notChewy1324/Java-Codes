import java.text.DecimalFormat;
import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###,###.00");
		
		double checking, savings, charge;
		
		System.out.println("Welcome to Lions Nation Bank!!");
		System.out.println("What is the balance in your chekcking account?: ");
		checking = scan.nextDouble();
		System.out.println("What is the balance in your savinga account?: ");
		savings = scan.nextDouble();
		
		if (checking >= 1000 || savings >= 1500) {
			charge = 0;
		} else {
			charge = 0.15;
		}
		
		System.out.println("You have " + checking + " in your checking account.");
		System.out.println("You have " + savings + " in your savings account.");
		System.out.println("Your service charge per check is " +  charge);
	}

}
