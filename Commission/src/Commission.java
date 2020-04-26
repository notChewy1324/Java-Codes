import java.text.DecimalFormat;
import java.util.Scanner;

public class Commission {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###,###.00");
		
		double usersales, one, two, three;
		
		System.out.println("Sales for the month: ");
		usersales = scan.nextDouble();
		
		if (usersales <= 100000) {
			one = usersales / 0.01;
			System.out.println("Your 1% commission is " + money.format(one));
		} else if (usersales > 100000 && usersales <= 200000) {
			two = usersales / 0.02;
			System.out.println("Your 2% commission is " + money.format(two));
		} else if (usersales > 200000) {
			three = 0.03 * usersales;
			System.out.println("Your 3% commission is " + money.format(three));
		} 
		

	}

}
