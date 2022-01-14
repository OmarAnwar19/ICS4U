import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);

		String strMonth = null;

		try {

			System.out.print("Enter a month (string): ");
			strMonth = (scanner1.next()).toLowerCase();

		} catch (Exception e) {

			System.out.println("Please enter a valid string.");
		}

		switch (strMonth) {
		case ("january"):
			System.out.println("There are 31 days in this month.");
			break;
		case ("february"):
			System.out.print("There are 29 days in this month, or 28 days during leap years.");
			break;
		case ("march"):
			System.out.println("There are 31 days in this month.");
			break;
		case ("april"):
			System.out.println("There are 30 days in this month.");
			break;
		case ("may"):
			System.out.println("There are 31 days in this month.");
			break;
		case ("june"):
			System.out.println("There are 30 days in this month.");
			break;
		case ("july"):
			System.out.println("There are 31 days in this month.");
			break;
		case ("august"):
			System.out.println("There are 31 days in this month.");
			break;
		case ("september"):
			System.out.println("There are 30 days in this month.");
			break;
		case ("october"):
			System.out.println("There are 31 days in this month.");
			break;
		case ("november"):
			System.out.println("There are 30 days in this month.");
			break;
		case ("december"):
			System.out.println("There are 31 days in this month.");
			break;
		default:
			System.out.println("An invalid month was entered.");
			break;

		}

	}

}