/**
 * Description: This is the super class for the rest of the media classes, the
 * super class is the one which holds common variables and methods which are
 * shared by all types of media, here, we hold the media title, and length, and
 * the getters and setters for all of them. This is because these attributes are
 * shared by all members of the media class
 *
 * @author (Omar Anwar)
 * @version (12/13/2021)
 */

public class Media {

	// declaring instance variables, for the product name, product quantity, and
	// product price
	public String strTitle;
	public int intLengthSeconds;

	// first constructor for the media type, takes in name, and length
	public Media(String ttl, int sec) {

		// initializing the instance variables using the user inputs
		this.strTitle = ttl;
		this.intLengthSeconds = sec;

	}

	// default constructor, incase the user does not enter any values
	public Media() {

		// since there are no user inputs taken in, initialize the instance variables to
		// a preset value
		this.strTitle = "Media Title";
		this.intLengthSeconds = 0;

	}

	// method to format the time which the user enters in seconds, into a real time
	// in the format of hours:minutes:seconds
	public String formatTime(int intSeconds) {

		// declaring variables for the hours, minutes and seconds
		int intHours = 0, intMinutes = 0, intSecs = 0;

		// a variable for the formatted time
		String strFormattedLength = null;

		// assigning the values of the times to the variables
		// there are 3600 seconds in an hour, so dividing it by 3600, will get us a
		// corret hour count, it is important to note, that since this value is an
		// integer, the hours will round up to a whole value, which is what we want,
		// since a movie cant be part hours (those would be the minutes)
		intHours = intSeconds / 3600;
		// the minutes are the same principal, take the seconds, divide it by 3600, to
		// get hours, and then divide that value by 60 again for the minutes. We are
		// using the modulous operator here, so it will give us only the whole numbers.
		intMinutes = (intSeconds % 3600) / 60;
		// finally, dividing the seconds by 60, using modulous, so we only get the whole
		// numbers, and not the fractions. We do not intend to display milliseconds, so
		// we do not need to keep track of values which are so small
		intSecs = intSeconds % 60;

		// assigning the formatted values to the string, its pretty much the same as
		// using the printf statement, as we can insert the values of our formatted
		// times to the variable
		strFormattedLength = String.format("%02d:%02d:%02d", intHours, intMinutes, intSecs);

		// returning the newly formattedtime
		return (strFormattedLength);

	}

	// getter method for the media name, returns the media name as a string
	public String getTitle() {

		// return the media name as a string
		return (this.strTitle);

	}

	// getter method for the length of the media item
	public String getLength() {

		// return the length of the media in seconds, and the length of the media as a
		// formatted time
		// for the formatted time, we are calling the variable for formatting time, and
		// passing the length in seconds into it
		return ("\nLength in seconds : " + this.intLengthSeconds + "\nFormatted length (hh:mm:ss): "
				+ formatTime(this.intLengthSeconds));

	}

	// setter method for the title, takes in a user input, and assigns it to the
	// title variable
	public void setTitle(String ttl) {

		// assign the string that the user entered to the product name instance variable
		this.strTitle = ttl;

	}

	// setter method for the media length, takes in a user input, and assigns it
	// as the media length
	public void setLength(int lgh) {

		// assign the integer that the user entered to the length instance variable
		this.intLengthSeconds = lgh;

	}

	// toString method, which outputs the title and the length of the media to a
	// string
	public String toString() {

		// returning the string, inside it, we return title, and the formatted time. We
		// get the formatted time by using the formatTime method, and passing through
		// the length in seconds
		return ("\nTitle: " + this.strTitle + "\nLength (hh:mm:ss): " + formatTime(this.intLengthSeconds));

	}

}
