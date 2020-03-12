import java.text.DecimalFormat;
import java.util.Scanner;

public class Shipping {

	public static void main(String[] args) {
		
		//Stuff
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###,###.00");
		
		int cookies, overnight;
		double cookietotal, shippingtotal, total;
		
		System.out.println("Welcome to the Aiello Cookie Company!");
		
		System.out.println("How many cookies would you like to order?: ");
		cookies = scan.nextInt();
		
		System.out.println("Would you like overnight delivery? (Enter 0 for no, enter 1 for yes)" );
		overnight = scan.nextInt();
		
		cookietotal = cookies * 2.50; 
		
		if (cookietotal < 10.00) {
			shippingtotal = 2.00;
		} else {
			shippingtotal = 3.00;
		}
		
		if (overnight == 1) {
			shippingtotal = shippingtotal + 5.00;
		}
		
		System.out.println("Thank you for your order!");
		System.out.println("Number of cookies: " + cookies);
		System.out.println("Shipping: " + money.format(shippingtotal));
		System.out.println("Total cost: " + money.format(cookietotal + shippingtotal));
	}

}
