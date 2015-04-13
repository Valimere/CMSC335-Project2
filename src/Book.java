/**
 * file name Book
 * date      29 Mar 2015
 * author    Stephen Drollinger
 * purpose   Class to hold book properties
 *
 */
import java.util.List;

// Defining Book
public class Book {

    // Setting Book Specific Variables

    public int index;
    public String title;
    public String genre;
    public double price;
    public int author_index;
    public List<String> extras;

    // constructing Book bringing in super's properties
    public Book(int index, String title, String genre,double price, 
            int author_index, List<String> extras) {

        // bringing in book specific properties
        index = this.index;
        title = this.title;
        genre = this.genre;
        price = this.price;
        author_index = this.author_index;
        extras = this.extras;
    }

    public String toString() {
        return "\n" + "Index: " + getIndex() + "\n" + "Genre: " + getGenre() + "\n" + 
                "price: " + getPrice() + "\n" + "author_index: " + getAuthor_Index() + "\n";
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
     * @return the author_index
     */
    public int getAuthor_Index() {
        return author_index;
    }

    /**
     * @param author_index the author_index to set
     */
    public void setAuthor_Index(int author_index) {
        this.author_index = author_index;
    }

    /**
     * @return the extras
     */
    public List<String> getExtras() {
        return extras;
    }

    /**
     * @param extras the extras to set
     */
    public void setExtras(List<String> extras) {
        this.extras = extras;
    }


}
