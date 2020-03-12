import java.text.DecimalFormat;
import java.util.Scanner;

public class Hardware {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###,###.00");
		
		byte bolts, nuts, washers;
		double bolt, nut, washer, total;
		
		System.out.println("Number of bolts: ");
		bolts = scan.nextByte();
		System.out.println("Number of nuts: ");
		nuts = scan.nextByte();
		System.out.println("Number of washers: ");
		washers = scan.nextByte();
		
		if (bolts != nuts) {
			System.out.println("**Check order for errors**");
		} else {
			bolt = bolts * 0.05;
			nut = nuts * 0.03;
			washer = washers * 0.01;
			total = bolt + nut + washer;
			System.out.println("**Order is OK**");
			System.out.println("Total cost: " + money.format(total));
		}
	}

}
