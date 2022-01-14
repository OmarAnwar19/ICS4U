/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class bankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account regAcc = new Account("John", 200);
		StudentAccount stdAcc = new StudentAccount("John's Son", 200);
		
		regAcc.depositBalance(20);
		System.out.println("$20 Deposited, new balance = " + regAcc.getBalance());
		
		regAcc.withdrawBalance(50);
		System.out.println("$50 Withdrawn, new balance = " + regAcc.getBalance());
		
		stdAcc.depositBalance(20);
		System.out.println("$20 Deposited, new balance = " + stdAcc.getBalance());
		
		stdAcc.withdrawBalance(50);
		System.out.println("$50 Withdrawn, new balance = " + stdAcc.getBalance());
		
		System.out.println(regAcc + "\n" + stdAcc);
		
	}

}
