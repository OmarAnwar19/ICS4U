import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		String strWord, strNoSpace, strReverse;
		
		System.out.print("Please enter a string: ");
		
		strWord = (scanner1.nextLine()).toLowerCase();
		
		strNoSpace = strWord.replace(" ", "");

		strReverse = new StringBuilder(strNoSpace).reverse().toString();
		
		if ((strNoSpace) == (strReverse)) {
			
			System.out.println("\nThe string " + strWord + " is a palindrome.");
		
		} else {
			
			System.out.println("\nThe string " + strWord + " is not a palindrome.");
			
		}
		
		scanner1.close();
		
	}

}
