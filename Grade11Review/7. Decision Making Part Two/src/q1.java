import java.util.Arrays;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		int [ ] array1 = new int [6];
		
		int intUserGrade, intGradeTotal, intAverage, intVolHours;
		
		System.out.println("This program calculates your scholarship elligebility based on multiple factors, \n"
				+ "including: top 6 marks, volunteer hours.");
		
		intGradeTotal = 0;
		
		for (int i = 0; i <= array1.length - 1; i++ ) {
			
			System.out.print("\nPlease enter grade " + (i + 1) + " : ");
			intUserGrade = scanner1.nextInt();
			
			intGradeTotal += intUserGrade;
			array1[i] = intUserGrade;
			
		}
		
		System.out.print("\nPlease enter your volunteer hours: ");

		intVolHours = scanner1.nextInt();
		
		intAverage = (intGradeTotal / 6);

		if (intAverage >= 90 && intVolHours >= 100) {
			
			System.out.println("\nTop 6 Average: " + intAverage);
			System.out.println("Volunteer Hours: " + intVolHours);
			System.out.println("You are eligible for a scholarship.");
			
		} else if (intAverage >= 80 && intVolHours >= 200) {
			
			System.out.println("Top 6 Average: " + intAverage);
			System.out.println("Volunteer Hours: " + intVolHours);
			System.out.println("You are eligible for a scholarship.");
		
		} else {
			
			System.out.println("You are not eligible for a scholarship.");
		
		}
		
		scanner1.close();
	}

}
