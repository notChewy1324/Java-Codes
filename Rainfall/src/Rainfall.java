
public class Rainfall {

	public static void main(String[] args) {
		//Vars
		byte april = 12, may = 14, june = 8;
		float avg = ((float) april + may + june) / 3;
		
		//Outputs
		System.out.println("Rainfall for April:\t" + april);
		System.out.println("Rainfall for May:\t" + may);
		System.out.println("Rainfall for June:\t" + june);
		System.out.println("Average rainfall:\t" + avg);
	}

}
