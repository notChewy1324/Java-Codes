import java.util.Scanner;
import java.text.*;

public class PayLab {

	public static void main(String[] args) {
		
		//Stuff
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###,###.00");
		double hrs, rate;
		double reg, ot, total;
		
		System.out.println("Welcome to the Pay Calculator Program!");
		
		System.out.println("Enter the number of hours you worked: ");
		hrs = scan.nextDouble();
		System.out.println("Enter the the hourly rate of pay: ");
		rate = scan.nextDouble();
		
		if (hrs <= 40) {
			reg = rate * hrs;
			ot = 0;
			total = reg + ot;
		} else {
			reg = 40 * rate;
			ot = (hrs-40) * rate * 1.5;
			total = reg + ot;
		}
		
		System.out.println("You eanred " + money.format(total) + " for " + hrs + " hours of work at " + money.format(rate) + " per hour.");
		
		System.out.println("Overtime pay: " + money.format(ot));
		System.out.println("Total pay: " + money.format(total));
	}

}
