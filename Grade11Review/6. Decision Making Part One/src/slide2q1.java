import java.util.Scanner;

public class slide2q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		int intMonth;
		
		System.out.println("Please enter a month: ");
		
		intMonth = scanner1.nextInt();
		
		if (intMonth == 2) {
		
			System.out.println("There are 28 days in this month, or 29 days on leap years.");
			
		} else if ((intMonth % 2) == 0) {
		
			System.out.println("There are 30 days in this month.");
			
		} else if ((intMonth % 2) != 0) {
			
			System.out.println("There are 31 days in this month.");
			
		}
		
		scanner1.close();
		
	}

}
