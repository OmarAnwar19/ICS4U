/**
 * Description: child class of the Media super class, inherits the same instance
 * variables and methods from the parent or super class, and then add the
 * specific instance variables and methods which are needed for the Song class
 *
 * @author (Omar Anwar)
 * @version (12/13/2021)
 */

//the Movie class extends the Media class, which means that it inherits methods and variables from it
public class Movie extends Media {

	// declaring instance variables specific to the movie class
	// two strings for the director name, and the movie's rating
	private String strDirector, strRating;

	// first constructor for the Song class, takes in the variables for the
	// super class, aswell as the variables specific for this child class
	public Movie(String ttl, int sec, String dir, String rtg) {

		// assigning the variables for song title, and length
		// variables in the department super class
		super(ttl, sec);

		// assigning the rest of the variables to the instance variables specific to the
		// movie class
		this.strDirector = dir;
		this.strRating = rtg;

	}

	// default constructor, incase the user does not enter any values
	public Movie() {

		// passing default values to the super class
		super();

		// since there are no user inputs taken in, initialize the rest of instance
		// variables to a preset value
		this.strDirector = "Director";
		this.strRating = "Rating";

	}

	// method to format the time which the user enters in seconds, into a real time
	// in the format of hours:minutes, this is an overriden method, since we do not
	// want to display the seconds in the movie, the override keyword makes sure
	// that we can modify what the method does without fear of any errors or
	// anything going wrong
	@Override
	public String formatTime(int intSeconds) {

		// declaring variables for the hours and minutes NO SECONDS
		int intHours = 0, intMinutes = 0;

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
		// we do not need a variable for the seconds

		// assigning the formatted values to the string, its pretty much the same as
		// using the printf statement, as we can insert the values of our formatted
		// times to the variable
		strFormattedLength = String.format("%02d:%02d", intHours, intMinutes);

		// returning the newly formatted time
		return (strFormattedLength);

	}

	// getter method for the length of the media item, overriden, so we dont show seconds
	@Override
	public String getLength() {

		// return the length of the media in seconds, and the length of the media as a
		// formatted time
		// for the formatted time, we are calling the variable for formatting time, and
		// passing the length in seconds into it
		return ("\nLength in seconds : " + this.intLengthSeconds + "\nFormatted length (hh:mm): "
				+ formatTime(this.intLengthSeconds));

	}

	// getter method for the director's name, returns the name as a string
	public String getDirector() {

		// return the director name as a string
		return (this.strDirector);

	}

	// getter method for the movie's rating, returns the rating as a string
	public String getRating() {

		// return the movie rating as a string
		return (this.strRating);

	}

	// setter method for the movie director's name, takes in a user input, and
	// assigns it to the movie director variable
	public void setDirector(String nme) {

		// assign the string that the user entered to the dirctor name instance variable
		this.strDirector = nme;

	}

	// setter method for the movie rating, takes in a user input, and assigns it to
	// the movie rating variable
	public void setRating(String rtg) {

		// assign the string that the user entered to the movie rating instance variable
		this.strRating = rtg;

	}

	// toString method, which outputs all the same things as the one in the super
	// class, but we override it, so that we output also the variables specific to
	// this child class, the reason for the override function is explained above at
	// the formatTime method.
	@Override
	public String toString() {

		// returning the string, inside it, we return title, rating, director name, and
		// the formatted time, now without seconds. We get the formatted time by using
		// the formatTime method, and passing through the length in seconds, we also
		// return the song genre.
		return ("\nTitle: " + super.strTitle + "\nLength (hh:mm): " + formatTime(super.intLengthSeconds) + "\nRating: "
				+ this.strRating + "\nDirector: " + this.strDirector);

	}

}
