import java.util.Scanner;
import java.text.*;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###,###.00");
		
		System.out.println("Welcome to The Frame Store!");
		
		int Len_Pic;
		System.out.println("Please enter the length of the picture in inches: ");
		Len_Pic = scan.nextInt();
		
		
		int Wid_Pic;
		System.out.println("Please enter the width of the picture in inches: ");
		Wid_Pic = scan.nextInt();
		
		double glass = (float)Len_Pic * Wid_Pic * 0.03;
		double frame = (2 * Len_Pic + 2 * Wid_Pic) / 12 * 2.45;
		double total = glass + frame;
		
		System.out.print("Here is the calculation:");
		System.out.print("\n Length: " + Len_Pic + " \n Width: " + Wid_Pic + "\n Glass: " + money.format(glass) + "\n Frame: " + money.format(frame) + "\n TOTAL: " + money.format(total) );
		
	}

}
