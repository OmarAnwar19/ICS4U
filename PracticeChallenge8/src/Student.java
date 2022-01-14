//Create a Student class with name, and grade.  The class should have a constructor,
//default constructor, get and set methods, and toString method 


public class Student {

	private String strStudentName;
	private byte bytGrade;
	
	Student (String nme, byte grd) {
		
		this.strStudentName = nme;
		this.bytGrade = grd;
		
	}
	
	Student () {
		
		this.strStudentName = "Student Name";
		this.bytGrade = 00;
		
	}
	
	public void setName (String nme) {
		
		this.strStudentName = nme;
		
	}

	public void setGrade (byte grd) {
		
		this.bytGrade = grd;
		
	}
	
	public String getName() {
		
		return(this.strStudentName);
		
	}
	
	public byte getGrade() {
		
		return(this.bytGrade);
		
	}
	
	public String toString() {
		
		return("\nStudent name: " + this.strStudentName +
				"\nStudent grade: " + this.bytGrade
				);
		
	}

}
