/**
 * file name Journal
 * date      12 April
 * author    Stephen Drollinger
 * purpose   class to define the Journal
 */
import java.util.Calendar;

public class Journal {
    
    private int index;
    private String title;
    private String genre;
    private double price;
    private int authorIndex;
    private Calendar journalDatePublished;
    private int issue;

    public Journal(int index, String title, String genre, double price,
            int authorIndex, Calendar journalDatePublished, int issue) {
        this.index = index;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.authorIndex = authorIndex;
        this.journalDatePublished = journalDatePublished;
        this.issue = issue;
    }
    
    public String toString() {
        return "\n" + "Index: " + getIndex() + "\n" + "Title: " + getTitle() +
                "\n" + "Genre: " + getGenre() + "\n" + "Price: $" + getPrice() +
                "\n" + "Author Index: " + getAuthorIndex() +
                "\n" + "Date Published: " + dateToString(getJournalDatePublished()) +
                "\n" + "Issue: " + getIssue() + "\n";
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
     * @return the journalDatePublished
     */
    public Calendar getJournalDatePublished() {
        return (journalDatePublished);
    }

    /**
     * @param journalDatePublished the dateOfBirth to set
     */
    public void setJournalDatePublished(Calendar journalDatePublished) {
        this.journalDatePublished = journalDatePublished;
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
