/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class SuperClass {

	private String strAttribute;
	private int intAttribute;
	private boolean bolAttribute;

	SuperClass(String str, int int1, boolean bol) {

		this.strAttribute = str;
		this.intAttribute = int1;
		this.bolAttribute = bol;

	}

	SuperClass() {

		this.strAttribute = null;
		this.intAttribute = 0;
		this.bolAttribute = false;

	}

	public String getString() {

		return (this.strAttribute);

	}

	public int getInt() {

		return (this.intAttribute);

	}

	public boolean getBoolean() {

		return (this.bolAttribute);

	}

	public void setString(String str) {

		this.strAttribute = str;

	}

	public void setInt(int int1) {

		this.intAttribute = int1;

	}

	public void setBoolean(Boolean bol) {

		this.bolAttribute = bol;

	}

	public boolean count5() {

		int temp = 0;

		for (int i = 0; i < this.strAttribute.length(); i++) {

			temp += 1;

		}

		if (temp >= 5) {

			return (true);

		} else {

			return (false);

		}

	}

	public String toString() {

		return ("\nString: " + this.strAttribute + "\nInt: " + this.intAttribute + "\nBoolean: " + this.bolAttribute);

	}

}
