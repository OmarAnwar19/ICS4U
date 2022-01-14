import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		int intCount;
		
		System.out.print("Seconds untill blastoff: ");
		
		intCount = scanner1.nextInt();
		
		System.out.println("");
		
		for (int i=intCount; i>=0; i--) {
			
			System.out.println(i + "...");
			
		}
		
		System.out.println("BLASTOFF!!!");
	
		scanner1.close();
		
	}

}
