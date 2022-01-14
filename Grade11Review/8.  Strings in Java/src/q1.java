import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		String strWord;
		
		int intWordCount;
		
		System.out.print("Please enter a word: ");
		
		strWord = scanner1.nextLine();
		
		intWordCount = strWord.length();
		
		for (int i = 0; i < intWordCount; i++) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(strWord.charAt(j));
			}
			
			System.out.println();
		}
		
		for (int i = intWordCount; i > 0; i--) {
			for (int j = 0; j < i; ++j) {
				System.out.print(strWord.charAt(j));
			}
			
			System.out.println();
		}

		scanner1.close();
		
	}

}
