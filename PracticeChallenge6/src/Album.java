/**
 * Description: Album class, program explained in the main
 *
 * @author (Omar Anwar)
 * @version (11/15/2021)
 */

public class Album {

	private String strTitle, strArtist, strGenre;
	private int intRelease;

	Album(String ttl, String art, String gen, int rel) {

		this.strTitle = ttl;
		this.strArtist = art;
		this.strGenre = gen;
		this.intRelease = rel;

	}

	Album() {

		this.strTitle = "Album Title";
		this.strArtist = "Album Artist";
		this.strGenre = "Album Genre";
		this.intRelease = 0000;

	}

	public String getAlbumTitle() {

		return (this.strTitle);

	}

	public String getAlbumArtist() {

		return (this.strArtist);

	}

	public String getAlbumGenre() {

		return (this.strGenre);

	}

	public int getAlbumReleaseYear() {

		return (this.intRelease);

	}

	public void setAlbumTitle(String title) {

		this.strTitle = title;

	}

	public void setAlbumArtist(String artist) {

		this.strArtist = artist;

	}

	public void setAlbumGenre(String genre) {

		this.strGenre = genre;

	}

	public void setAlbumReleaseYear(int year) {

		this.intRelease = year;

	}
	
	public String toString() {
		
		return ("\nAlbum Title: " + this.strTitle + 
				"\nAlbum Artist: " + this.strArtist + 
				"\nAlbum Genre: " + this.strGenre + 
				"\nAlbum Release Year: " + this.intRelease
				);
				
	}

}
