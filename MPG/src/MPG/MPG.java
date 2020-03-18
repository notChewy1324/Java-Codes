package MPG;
import java.util.Scanner;

public class MPG {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int first, last, gas;
		double mpg;

		System.out.println("Welcome to the Miles per Gallon Calculator!");
		
		first = 1;
		
		while (first > 0) {
			System.out.println("\nEnter the INITIAL ODOMETER READING or a negative number to STOP: ");
			first = scan.nextInt();
			
			if (first < 0) {
				System.out.println("\nBYE!!");
			} else {
				System.out.println("\nEnter the FINAL ODOMETER READING: ");
				last = scan.nextInt();
				
				System.out.println("\nEnter the number of GALLONS OF GAS used: ");
				gas = scan.nextInt();
				
				mpg = (last - first) / gas;
				
				System.out.println("\n\tMiles per Gallon: " + mpg);
			}
		}
		
	}

}
