/**
 * Description: child class of the Media super class, inherits the same instance
 * variables and methods from the parent or super class, and then add the
 * specific instance variables and methods which are needed for the Song class
 *
 * @author (Omar Anwar)
 * @version (12/13/2021)
 */

//the Song class extends the Media class, which means that it inherits methods and variables from it
public class Song extends Media {

	// declaring instance variables specific to the song class
	// two strings for the artist name and genre
	private String strArtist, strGenre;

	// first constructor for the Song class, takes in the variables for the
	// super class, aswell as the variables specific for this child class
	public Song(String ttl, int sec, String art, String gen) {

		// assigning the variables for song title, and length
		// variables in the department super class
		super(ttl, sec);

		// assigning the rest of the variables to the instance variables specific to the
		// song class
		this.strArtist = art;
		this.strGenre = gen;

	}

	// default constructor, incase the user does not enter any values
	public Song() {

		// passing default values to the super class
		super();

		// since there are no user inputs taken in, initialize the rest of instance
		// variables to a preset value
		this.strArtist = "Artist";
		this.strGenre = "Genre";

	}

	// method to format the time which the user enters in seconds, into a real time
	// in the format of hours:minutes, this is an overriden method, since we do not
	// want to display the seconds in the movie, the override keyword makes sure
	// that we can modify what the method does without fear of any errors or
	// anything going wrong
	@Override
	public String formatTime(int intSeconds) {

		// declaring variables for the hours and minutes NO SECONDS
		int intSecs = 0, intMinutes = 0;

		// a variable for the formatted time
		String strFormattedLength = null;

		// we do not need a variable for the hours
		
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
		strFormattedLength = String.format("%02d:%02d", intMinutes, intSecs);

		// returning the newly formatted time
		return (strFormattedLength);

	}

	// getter method for the length of the media item, overriden so we dont show hours
	@Override
	public String getLength() {

		// return the length of the media in seconds, and the length of the media as a
		// formatted time
		// for the formatted time, we are calling the variable for formatting time, and
		// passing the length in seconds into it
		return ("\nLength in seconds : " + this.intLengthSeconds + "\nFormatted length (mm:ss): "
				+ formatTime(this.intLengthSeconds));

	}

	// getter method for the song artist's name, returns the name as a string
	public String getArtist() {

		// return the media name as a string
		return (this.strArtist);

	}

	// getter method for the song's genre, returns the genre as a string
	public String getGenre() {

		// return the song genre as a string
		return (this.strGenre);

	}

	// setter method for the song title, takes in a user input, and assigns it to
	// the song artist variable
	public void setArtist(String ttl) {

		// assign the string that the user entered to the artist name instance variable
		this.strArtist = ttl;

	}

	// setter method for the artist name, takes in a user input, and assigns it to
	// the song genre variable
	public void setGenre(String gen) {

		// assign the string that the user entered to the song genre instance variable
		this.strGenre = gen;

	}

	// toString method, which outputs all the same things as the one in the super
	// class, but we override it, so that we output also the variables specific to
	// this child class, the reason for the override function is explained above at
	// the formatTime method.
	@Override
	public String toString() {

		// returning the string, inside it, we return title and author, the genre, and
		// the formatted time, now without seconds. We get the formatted time by
		// using the formatTime method, and passing through the length in seconds, we
		// also return the song genre.
		return ("\nTitle: " + super.strTitle + " - " + this.strArtist + "\nLength (hh:mm): "
				+ formatTime(super.intLengthSeconds) + "\nGenre: " + this.strGenre);

	}

}
