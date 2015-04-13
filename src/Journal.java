/**
 * file name Journal
 * date      12 April
 * author    Stephen Drollinger
 * purpose   class to define the Journal
 */
import java.util.Calendar;

public class Journal {
    
    public int index;
    public String title;
    public String genre;
    public double price;
    public int authorIndex;
    public Calendar datePublished;
    public int issue;

    public Journal(int index, String title, String genre, double price,
            int authorIndex, Calendar datePublished, int issue) {
        index = this.index;
        title = this.title;
        genre = this.genre;
        price = this.price;
        authorIndex = this.authorIndex;
        datePublished = this.datePublished;
        issue = this.issue;
    }
    
    public String toString() {
        return "\n" + "Index: " + getIndex() + "\n" + "Title: " + 
                "\n" + "Genre: " + getGenre() + "\n" + "price: " + getPrice() + 
                "\n" + "author_index: " + getAuthorIndex() + 
                "\n" + "Date Published: " + dateToString(getDatePublished()) +
                "\n" + "Issue: " + getIssue();
    }
    
    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the authorIndex
     */
    public int getAuthorIndex() {
        return authorIndex;
    }

    /**
     * @param authorIndex the authorIndex to set
     */
    public void setAuthorIndex(int authorIndex) {
        this.authorIndex = authorIndex;
    }

    /**
     * @return the datePublished
     */
    public Calendar getDatePublished() {
        return (datePublished);
    }

    /**
     * @param datePublished the dateOfBrith to set
     */
    public void setDatePublished(Calendar datePublished) {
        this.datePublished = datePublished;
    }

    /**
     * @return the issue
     */
    public int getIssue() {
        return issue;
    }

    /**
     * @param issue the issue to set
     */
    public void setIssue(int issue) {
        this.issue = issue;
    }

    public static String dateToString(Calendar cal) {
        return cal.get(Calendar.MONTH)+1+"/"+cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.YEAR);
    }
    
}
