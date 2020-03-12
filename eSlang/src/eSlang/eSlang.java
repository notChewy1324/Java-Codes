package eSlang;
import java.util.Scanner;

public class eSlang {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String slang;
		
		System.out.println("Please enter the eSlang abbreviation: ");
		slang = scan.nextLine();
		slang = slang.toUpperCase();
		
		if (slang.equalsIgnoreCase("LOL")) {
			System.out.println("LOL = Laughing Out Loud");
		} else {
			if (slang.equalsIgnoreCase("IDK")) {
				System.out.println("IDK = I Don't Know");
			} else {
				if (slang.equalsIgnoreCase("IDC")) {
					System.out.println("IDC = I Don't Care");
				} else {
					if (slang.equalsIgnoreCase("OMG")) {
						System.out.println("OMG = O My Gosh");
				} else {
					if (slang.equalsIgnoreCase("JK")) {
						System.out.println("JK = Just Kiddin");
					} else {
						System.out.println("Sorry, don’t know that one.");
						}
					}
				}
			}
		}
	}
}
