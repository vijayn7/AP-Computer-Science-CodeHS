public class Song
{
    private String artist;
    private String title;
    private int minutes;
    private int seconds;

    public Song(String artist, String title, int minutes, int seconds){
      this.artist = artist;
      this.title = title;
      this.minutes = minutes;
      this.seconds = seconds;
    }

	/**
	* Returns value of artist
	* @return artist
	*/
	public String getArtist() {
        return artist;
	}

	/**
	* Sets new value of artist
	* @param artist Updated artist
	*/
	public void setArtist(String artist) {
	    this.artist = artist;
	}

	/**
	* Returns value of title
	* @return title
	*/
	public String getTitle() {
	    return title;
	}

	/**
	* Sets new value of title
	* @param title Updated title
	*/
	public void setTitle(String title) {
	    this.title = title;
	}

	/**
	* Returns value of minutes
	* @return minutes
	*/
	public int getMinutes() {
	    return minutes;
	}

	/**
	* Sets new value of minutes
	* @param minutes Updated minutes
	*/
	public void setMinutes(int minutes) {
	    this.minutes = minutes;
	}

	/**
	* Returns value of seconds
	* @return seconds
	*/
	public int getSeconds() {
	    return seconds;
	}

	/**
	* Sets new value of seconds
	* @param seconds Updated seconds
	*/
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	/**
	* Create string representation of Song for printing
	* @return String of the song
	*/
	@Override
	public String toString() {
		return "artist= " + artist + "\ntitle= " + title + "\nTime= " + minutes + ":" + seconds;
	}
}