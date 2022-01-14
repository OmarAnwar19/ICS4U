/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class Account {

	private String strName;
	private double dblBalance;

	Account(String nme, double blc) {

		this.strName = nme;
		this.dblBalance = blc;

	}

	Account() {

		this.strName = "User Name";
		this.dblBalance = 0.0;

	}

	public String getName() {
		
		return(this.strName);
		
	}
	
	public double getBalance() {

		return (this.dblBalance);

	}

	public void setBalance(double blc) {
		
		this.dblBalance = blc;
		
	}
	
	public void depositBalance(double dep) {

		this.dblBalance += dep;

	}

	public void withdrawBalance(double drw) {

		this.dblBalance -= drw;

	}
	
	public String toString() {
		
		return(this.strName.toUpperCase() + "'s BALANCE: \n$" + this.dblBalance);
		
	}

}
