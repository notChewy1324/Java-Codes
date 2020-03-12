
public class Unit2Test {

	public static void main(String[] args) {
		// vars
		byte totalEarned = 73;
		byte totalPoints = 80;
		float grade = ((float)totalEarned / totalPoints * 100);
		
		// Display text
		System.out.print("You earned " + totalEarned + " out of " + totalPoints + " for a " + grade);
	}

}
