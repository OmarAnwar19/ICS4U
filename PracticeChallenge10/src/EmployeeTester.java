/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class EmployeeTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee regEmp = new Employee("RJohn", 48500.267);
		HourlyEmployee hrlyEmp = new HourlyEmployee("HChad" , 48500.267, (byte) 40);
		
		System.out.println("\n\n" + regEmp + "\n\n" + hrlyEmp);
		
		hrlyEmp.setHourlySalary(54);
		
		System.out.println("\n\nHourly employee salary: " + hrlyEmp.getHourlySalary());
	
		System.out.println("\n\n" + regEmp + "\n\n" + hrlyEmp);

		
	}

}
