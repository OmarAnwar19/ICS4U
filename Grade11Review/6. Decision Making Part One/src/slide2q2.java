import java.util.Scanner;

public class slide2q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		int intUserGrade;
		
		System.out.print("Please enter your grade: ");
				
		intUserGrade = scanner1.nextInt();
		
		if (intUserGrade < 50) {
			
			System.out.println("You got an 'F'");
			
		} else if (intUserGrade >= 50 && intUserGrade < 60) {
			
			System.out.println("You got a 'D'");
			
		} else if (intUserGrade >= 60 && intUserGrade < 70) {
			
			System.out.println("You got a 'C'");
			
		} else if (intUserGrade >= 70 && intUserGrade < 80) {
			
			System.out.println("You got a 'B'");

		} else if (intUserGrade > 80) {
			
			System.out.println("You got an 'A'");
			
		}
		
		scanner1.close();
		
	}

}
