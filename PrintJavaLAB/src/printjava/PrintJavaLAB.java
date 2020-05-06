package printjava;

public class PrintJavaLAB {
	
	private static void printJ() {
		System.out.println("********");
		System.out.println("     * ");
		System.out.println("     * ");
		System.out.println("*    * ");
		System.out.println(" *  * ");
		System.out.println("   *  ");
	}
	
	private static void printA() {
		System.out.println("*****");
		System.out.println("*   *");
		System.out.println("*****");
		System.out.println("*   *");
		System.out.println("*   *");
	}
	
	private static void printV() {
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println(" * * ");
		System.out.println("  *  ");
	}

	public static void main(String[] args) {
		
		printJ();
		System.out.println();
		printA();
		System.out.println();
		printV();
		System.out.println();
		printA();
		System.out.println();

	}

}
