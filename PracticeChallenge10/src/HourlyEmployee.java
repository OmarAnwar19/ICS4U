/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class HourlyEmployee extends Employee{

	private byte bytHours;
	
	HourlyEmployee(String nme, double slr, byte hrs) {

		super(nme, slr);
		
		this.bytHours = hrs;

	}

	HourlyEmployee() {

		super();

		this.bytHours = 0;
		
	}
	
	public double getHourlySalary() {
		
		return(this.getSalary()/52/this.bytHours);
		
	}
	
	public void setHourlySalary(double hrr) {
		
		this.setSalary(hrr * this.bytHours * 52);
		
	}
	
	@Override
	public String toString() {
		
		return("[HOURLY] [" + this.bytHours + "] " + this.getName().toUpperCase() + "SALARY \n$" + this.getSalary());
		
	}
	
}
