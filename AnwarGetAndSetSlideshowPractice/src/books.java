/**
 * Description: create a program which allows the user to catalog books which
 * they own, and retrieve, or \ edit information about them
 *
 * @author (Omar Anwar)
 * @version (11/1/2021)
 */

public class books {

	// declaring variables for book info
	private String strBookName, strBookAuthor, strBookSummary;
	private int intBookReleaseYear;
	private float fltBookPrice;

	// constructor for assigning values to parameters
	books(String bnm, String bat, String bsr, int bry, float bpr) {

		// assiging the user input to the different variables
		this.strBookName = bnm;
		this.strBookAuthor = bat;
		this.strBookSummary = bsr;

		this.intBookReleaseYear = bry;
		this.fltBookPrice = bpr;

	}

	// default constructor
	books() {

		// assigning default values to the parameters of the class
		this.strBookName = "Book Name";
		this.strBookAuthor = "Book Author";
		this.strBookSummary = "Book Summary";

		this.intBookReleaseYear = 0000;
		this.fltBookPrice = 00.00f;

	}

	// getter methods
	// get method to return book info n
	public String getBookName() {

		// returning the book info that we asked for
		return (this.strBookName);

	}

	// get method to return book info n
	public String getBookAuthor() {

		// returning the book info that we asked for
		return (this.strBookAuthor);

	}

	// get method to return book info n
	public String getBookSumamry() {

		// returning the book info that we asked for
		return (this.strBookSummary);

	}

	// get method to return book info n
	public int getBookReleaseYear() {

		// returning the book info that we asked for
		return (this.intBookReleaseYear);

	}

	// get method to return book info n
	public String getBookPrice() {

		// since there is a $ sign before the price, we will make a variable first,
		// which creates this string
		String strBookPriceFormatted = ("$" + this.fltBookPrice);

		// returning the book info that we asked for
		return (strBookPriceFormatted);

	}

	// setter methods
	// set method to edit the book info for n parameter
	public void setBookName(String bookName) {

		// assigning the new value to the variable
		this.strBookName = bookName;

	}

	// set method to edit the book info for n parameter
	public void setBookAuthor(String bookAuthor) {

		// assigning the new value to the variable
		this.strBookName = bookAuthor;

	}

	// set method to edit the book info for n parameter
	public void setBookSummary(String bookSum) {

		// assigning the new value to the variable
		this.strBookName = bookSum;

	}

	// set method to edit the book info for n parameter
	public void setBookYear(int bookYear) {

		// assigning the new value to the variable
		this.intBookReleaseYear = bookYear;

	}

	// set method to edit the book info for n parameter
	public void setBookPrice(float bookPrice) {

		// assigning the new value to the variable
		this.fltBookPrice = bookPrice;

	}

	// toString method to output the info
	public String toString() {

		// returning/outputting the info
		return ("Book Name: " + this.strBookName + "\n" + "Book Author: " + this.strBookAuthor + "\n" + "Book Sumary: "
				+ this.strBookSummary + "\n" + "Book Release Year: " + this.intBookReleaseYear + "\n" + "Book Price: $"
				+ this.fltBookPrice

		);

	}

}
