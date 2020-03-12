import java.util.Scanner;

public class WhileCounting {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int start, stop;
		
		System.out.println("Enter starting point: ");
		start = scan.nextInt();
		
		System.out.println("Enter ending point: ");
		stop = scan.nextInt();
		
		if (start > stop) {
			System.out.println("No numbers to count.");
		} else {
			while (start <= stop) {
				System.out.println(start);
				start++; //increment by 1
			}
		}
		
	}

}
