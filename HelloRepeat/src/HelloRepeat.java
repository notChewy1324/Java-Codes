import java.util.Scanner;

public class HelloRepeat {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userText;
		int times, count;
		
		System.out.println("Enter a word: ");
		userText = scan.nextLine();
		
		times = userText.length();
		count = 1;
		
		while (count <= times) {
			System.out.println(userText);
			count++;
		}
	}

}
