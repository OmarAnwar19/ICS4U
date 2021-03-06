public class Person {

	private String strFName, strLName;
	private short shrHeight;
	private byte bytAge;

	Person(String fnm, String lnm, short hgt, byte age) {

		this.strFName = fnm;
		this.strLName = lnm;
		this.shrHeight = hgt;
		this.bytAge = age;

	}

	Person() {

		this.strFName = "First";
		this.strLName = "First";
		this.shrHeight = 000;
		this.bytAge = 00;

	}

	public void setFName(String fnm) {

		this.strFName = fnm;

	}

	public void setLName(String lnm) {

		this.strLName = lnm;

	}

	public void setHeight(short hgt) {

		this.shrHeight = hgt;

	}

	public void setAge(byte age) {

		this.bytAge = age;

	}

	public String getFName() {

		return (this.strFName);

	}

	public String getLName() {

		return (this.strLName);

	}

	public short getHeight() {

		return (this.shrHeight);

	}

	public byte getAge() {

		return (this.bytAge);

	}
	
	public String toString() {
		
		return ("\nFirst Name: " + this.strFName + 
				"\nLast Name: " + this.strLName + 
				"\nHeight (cm): " + this.shrHeight + 
				"\nAge (yrs): " + this.bytAge
				);
		
	}

}
