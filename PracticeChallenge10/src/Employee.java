/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class Employee {

	private String strName;
	private double dblSalary;

	Employee(String nme, double slr) {

		this.strName = nme;
		this.dblSalary = slr;

	}

	Employee() {

		this.strName = "Employee Name";
		this.dblSalary = 0.00;

	}
	
	public String getName() {
		
		return(this.strName);
		
	}
	
	public double getSalary() {
		
		return(this.dblSalary);
		
	}
	
	public void setSalary(double slr) {
		
		this.dblSalary = slr;
		
	}
	
	public String toString() {
		
		return("[REGULAR] " + this.strName.toUpperCase() + "SALARY \n$" + this.dblSalary);
		
	}

}
