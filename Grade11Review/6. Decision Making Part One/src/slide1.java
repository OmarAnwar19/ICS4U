import java.util.Scanner;

public class slide1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		int intUserGrade;
		
		System.out.print("Please enter your grade: ");
		intUserGrade = scanner1.nextInt();
		
		if (intUserGrade < 65) {
			
			System.out.println("\nYou failed.");
			
		} else if (intUserGrade >= 65) {
			
			System.out.println("\nYou passed!");
			
		} else {
			
			System.out.println("\nInvalid input.");
			
		}
		
		scanner1.close();
		
	}

}
