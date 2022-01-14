import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		
		int intNum, intResult;
		
		System.out.print("Please enter a number: ");
		
		intNum = scanner1.nextInt();
		
		System.out.println("");
		
		for (int i=0; i<=12; i++) {
			
			intResult = (intNum * i);
			
			System.out.println(intNum + " x " + i + " = " + intResult);
			
		}
	}

}
