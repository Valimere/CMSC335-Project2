/**
 * file name Author
 * date      29 Mar 2015
 * author    Stephen Drollinger
 * purpose   class to define Author's
 *
 */
import java.util.List;

// Defining Author
public class Author {

    // Setting Author Specific Variables
    public int index;
    public String firstName;
    public String lastName;
    public String name = firstName + " " + lastName;
    public String address;
    public List<String> extras;


    // constructing Author bringing in super's properties
    public Author(int index, String name, String address, List<String> extras) {

        // bringing in Author specific properties
        index = this.index;
        name = this.name;
        address = this.address;
        extras = this.extras;
    }

    
        public String toString() {
        return "\n" + "index: " + index + "\n" + "name: " + name + "\n" + 
                "address: " + address + "\n";
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
