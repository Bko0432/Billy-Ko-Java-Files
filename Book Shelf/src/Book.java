import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

private int pages;
private String title;
private String author;
private String blurb;
private String genre;
private Date d;
private String published;
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getBlurb() {
	return blurb;
}
public void setBlurb(String blurb) {
	this.blurb = blurb;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Date getD() {
	return d;
}
public void setD(String d) 
{
	SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
	try{
	this.d = sdf.parse(d);
	} catch (Exception e)
	{
		
		
	}
}
public String getPublished() {
	return published;
}
public void setPublished(String published) {
	this.published = published;
}
public Book(int pages, String title, String author, String blurb,String genre,String published, String d ){
	this.pages = pages;
	this.title = title;
	this.author = author;
	this.blurb = blurb;
	this.genre = genre;
	setD(d);
	this.published = published;
	
	
}



	}


