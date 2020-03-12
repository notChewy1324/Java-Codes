import java.util.Scanner;
import java.text.*;

public class Restaurant {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###,###.00");
		
		double cost, tax, tip, total;
		
		System.out.println("Enter the basic cost: ");
		cost = scan.nextDouble();
		
		System.out.print("Enter the tax as a percntage: ");
		tax = scan.nextDouble();
		
		System.out.print("Enter the tip as a percentage: ");
		tip = scan.nextDouble();
		
		total = cost + (cost*tax/100) + (cost*tip/100);
		
		System.out.print("Total cost: " + money.format(total));
	}

}
