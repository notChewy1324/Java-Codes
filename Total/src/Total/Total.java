package Total;
import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int num, count, num2, total;
		count = 0;
		total = 0;
		
		System.out.println("How many numbers would you like to enter?: ");
		num = scan.nextInt();
		
		while (count < num) {
			count++;
			System.out.println("Enter number " + count + ": ");
			num2 = scan.nextInt();
			total = total + num2;
		}
		
		System.out.println("The total is: " + total);

	}

}
