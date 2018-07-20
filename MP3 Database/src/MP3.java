
public class MP3 {

private String Title;
private String Genre;
private String Artist;
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
public String getArtist() {
	return Artist;
}
public void setArtist(String artist) {
	Artist = artist;
}

public String changeToString()
{
	return("Singer: "+ Artist + " Song: "+ Title + " Genre : " + Genre);
}

	}


