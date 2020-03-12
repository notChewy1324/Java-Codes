
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num1 = (1/2) + (1/2);
		double num2 = 0.5 + 0.5;
		byte num3 = 17/3;
		byte num4 = 17%3;
		int pennies = 372;
		int bills = pennies / 100;
		
		System.out.println(num1);
		System.out.println((float)1/2 + (float)1/2);
		System.out.println(num2);
		System.out.println((num1 + 3.5) / 2.0);
		System.out.println((6/12.0 + 4) / 2);
		
		System.out.println("The quotient: " + num3);
		System.out.println("The remainder: " + num4);
		System.out.println("As a deciaml: " + (float)17/3);
		
		System.out.println("Number of bills: " + bills);
		System.out.println("Number of pennes left over: " + 372 % 100);
	}

}
