import java.util.Scanner;

public class slide1q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		int intTemp;
		
		System.out.print("Please enter the temperature (*C): ");
		intTemp = scanner1.nextInt();
		
		if (intTemp <= 0) {
			
			System.out.println("\nThe temperature is freezing.");
			
		} else if (intTemp > 0) {
			
			System.out.println("\nThe temperature is not freezing.");
			
		} else {
			
			System.out.println("\nInvalid input.");
			
		}
		
		scanner1.close();
		
	}

}
