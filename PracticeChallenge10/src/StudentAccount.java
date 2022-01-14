/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class StudentAccount extends Account {

	StudentAccount(String nme, double blc) {
		
		super(nme, blc);

	}

	StudentAccount() {
		
		super();

	}

	@Override
	public void depositBalance(double dep) {

		this.setBalance(this.getBalance() + (dep+1));

	}
	
	@Override
	public void withdrawBalance(double drw) {

		this.setBalance(this.getBalance() - (drw+2));

	}

	@Override
	public String toString() {

		return ("[STUDENT] " + this.getName().toUpperCase() + "'s BALANCE: \n$" + this.getBalance());

	}

}
