
public class Payroll {

	public static void main(String[] args) {
		long hoursWorked = 40;
		double payRate = 10;
		double taxRate = 0.10;
		
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Amount: " + ( hoursWorked * payRate ));
		System.out.println("Tax Amount: " + ( hoursWorked * payRate * taxRate));
	}

}
