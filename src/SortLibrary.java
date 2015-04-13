/**
 * file name SortLibrary
 * date      29 Mar 2015
 * author    Stephen Drollinger
 * purpose   User sends Library to this class to be sorted in user defined variable (way)
 *
 */

import java.util.*;

/**
 * @author Valimere
 */
public class SortLibrary {

    public static String sortedLibrary = "";
    private static Map<Integer, Author> libraryOfAuthors;
    private static Map<Integer, Book> authorsBooks;
    private static Map<Integer, Journal> authorsJournal;
    private int authorIndex;
    private String authorName;
    private String bookTitle;
    private double bookPrice;
    private int bookIndex;
    private Calendar journalDate;
    private int journalIssue;

    /*
     public SortLibrary(Map libraryOfAuthors, Map authorsBooks, Map authorsJournal) {
     libraryOfAuthors = this.libraryOfAuthors;
     authorsBooks = this.authorsBooks;
     authorsJournal = this.authorsJournal;
     }
     */
    public static String getSortedLibraryString(String sortLibraryBy,
                                                Map<Integer, Author> libraryOfAuthors, Map<Integer, Book> authorsBooks,
                                                Map<Integer, Journal> authorsJournal) {

        ArrayList<String> tempArrayStr = new ArrayList<String>();
        ArrayList<Integer> tempArrayInt = new ArrayList<Integer>();
        //Integer[] tempArrayInt = new Integer[libraryOfAuthors.size()];
        Integer tempKey = 0;

        System.out.print("I'm going to sort the Library by :");
        System.out.println(sortLibraryBy);

        Iterator authorIterator = libraryOfAuthors.entrySet().iterator();
        Iterator bookIterator = authorsBooks.entrySet().iterator();
        Iterator journalIterator = authorsJournal.entrySet().iterator();

        // Sorting by Author - Index

        if (sortLibraryBy.equals("Author - Index")) {
            sortedLibrary = "";

            // iterating over the pairs
            while (authorIterator.hasNext()) {
                Map.Entry pairs = (Map.Entry) authorIterator.next();
                tempKey = (Integer) pairs.getKey();
                tempArrayInt.add(tempKey);
            }
            // concatinating sorted list to sorted string to be displayed.
            for (int j = 0; j < tempArrayInt.size(); j++) {
                System.out.println("");

                // Adding author to sorted list
                sortedLibrary = sortedLibrary.concat("\nAuthor: " + libraryOfAuthors.get(tempArrayInt.get(j)).toString());
                System.out.println("");

                // Adding authors books beneath the author
                sortedLibrary = sortedLibrary.concat(booksByAuthor(tempArrayInt.get(j), authorsBooks));
                // Adding authors journals beneath the author
                sortedLibrary = sortedLibrary.concat(journalsByAuthor(tempArrayInt.get(j), authorsJournal));
            }
            //System.out.println("Printing tempArrayInt" + tempArrayInt);


        }
        // Sorting by Author - Name
        else if (sortLibraryBy.equals("Author - Name")) {
            sortedLibrary = "";

            // iterating over the pairs
            while (authorIterator.hasNext()) {

                Map.Entry pairs = (Map.Entry) authorIterator.next();
                String authorName = libraryOfAuthors.get((Integer) pairs.getKey()).name
                        + " : " + libraryOfAuthors.get((Integer) pairs.getKey()).index;
                System.out.println("authorName = " + authorName);
                // reversing order to sort by last name
                authorName = reverseNameOrder(authorName);
                tempArrayStr.add(authorName);
            }
            System.out.println("tempArray = " + tempArrayStr);

            // sorting by last name
            tempArrayStr.sort(null);
            System.out.println("tempArray before reversal = " + tempArrayStr);

            // getting author index of sorted list
            getSortedAuthorIndex(tempArrayInt, tempArrayStr);
            /*
             for (int i = 0; i < tempArrayStr.size(); i++) {
             String name = tempArrayStr.get(i);
             name = reverseNameOrder(name);
             tempArrayStr.set(i, name);
             List<String> list = new ArrayList<>(Arrays.asList(name.split("\\s*:\\s*")));
             int authorIndexValue = Integer.parseInt(list.get(1));
             tempArrayInt.add(authorIndexValue);
             System.out.println("authorIndexValue = " + authorIndexValue);
             }
             */
            for (int j = 0; j < tempArrayInt.size(); j++) {
                sortedLibrary = sortedLibrary.concat("\nAuthor: " + libraryOfAuthors.get(tempArrayInt.get(j)).toString());
                // Adding authors books beneath the author
                sortedLibrary = sortedLibrary.concat(booksByAuthor(tempArrayInt.get(j), authorsBooks));
                // Adding authors journals beneath the author
                sortedLibrary = sortedLibrary.concat(journalsByAuthor(tempArrayInt.get(j), authorsJournal));
            }
            System.out.println("");

            //getting auther index number
            sortedLibrary = sortedLibrary.concat(tempArrayStr.toString());
        }

        else if (sortLibraryBy.equals("Book - Title")) {
            sortedLibrary = "";

            // iterating over the pairs
            Map.Entry pairs = (Map.Entry) bookIterator.next();
            while (bookIterator.hasNext()) {
                String bookTitle = authorsBooks.get((Integer) pairs.getKey()).title
                        + " : " + authorsBooks.get((Integer) pairs.getKey()).author_index;
                System.out.println("bookName = " + bookTitle);
                tempArrayStr.add(bookTitle);
            }
            System.out.println("sorted Library = " + sortedLibrary);
            System.out.println("tempArray = " + tempArrayStr);

            // sorting by last name
            tempArrayStr.sort(null);
            System.out.println("tempArray before reversal = " + tempArrayStr);

            sortedLibrary = sortedLibrary.concat("\nBook: " + pairs.getValue());
            sortedLibrary = sortedLibrary.concat("\nAuthor: " + libraryOfAuthors.get((Integer) authorsBooks.get(pairs.getKey()).author_index).getName());


            // getting author index of sorted list
            getSortedAuthorIndex(tempArrayInt, tempArrayStr);

            System.out.println("tempArrayInt after sorting = " + tempArrayInt);
/*
            for (int j = 0; j < tempArrayInt.size(); j++) {
                // displayinb book with appropriate author
                System.out.println("tempArrayInt = " + tempArrayInt);
                sortedLibrary = sortedLibrary.concat("\nBook: " + authorsBooks.get(tempArrayInt.get(j)).toString());
                sortedLibrary = sortedLibrary.concat("\nAuthor: " + libraryOfAuthors.get(tempArrayInt.get(j)).toString());
                // Adding authors books beneath the author
                // Adding authors journals beneath the author
                sortedLibrary = sortedLibrary.concat(journalsByAuthor(tempArrayInt.get(j), authorsJournal));
            }
            */
            System.out.println("");
        }

        else if (sortLibraryBy.equals("Book - Price")) {
            sortedLibrary = "";

            getSortedBookByPrice(authorsBooks);
        }

        else if (sortLibraryBy.equals("Book - Index")) {
            sortedLibrary = "";
        }

        else if (sortLibraryBy.equals("Journal - Date")) {
            sortedLibrary = "";
        }

        else if (sortLibraryBy.equals("Journal - Issue")) {
            sortedLibrary = "";
        }





        System.out.println("the String of the sorted Library is :");
        System.out.println(sortedLibrary);
        return sortedLibrary;
    }

    private static String booksByAuthor(int authorIndex, Map<Integer, Book> authorsBooks) {

        Iterator bookIterator = authorsBooks.entrySet().iterator();
        String booksAuthor = "";
        String value = "";

        while (bookIterator.hasNext()) {
            Map.Entry pairs = (Map.Entry) bookIterator.next();
            int booksAuthorIndex = authorsBooks.get(pairs.getKey()).author_index;
            System.out.println("authorIndex = " + authorIndex);
            System.out.println("booksAuthorIndex = " + booksAuthorIndex);
            if (authorIndex == booksAuthorIndex) {
                booksAuthor += "\n Book: ";
                value = pairs.getValue().toString();
                System.out.println("Found match: " + value);
                booksAuthor += value;
                System.out.println("booksAuthor = " + booksAuthor);

            } else {
                System.out.println("Book not here");
            }

        }
        System.out.println("Books for author found = " + booksAuthor);
        return booksAuthor;
    }

    private static String journalsByAuthor(int authorIndex, Map<Integer, Journal> authorsJournals) {

        Iterator journalIterator = authorsJournals.entrySet().iterator();
        String journalsAuthor = "";
        String value = "";

        while (journalIterator.hasNext()) {
            Map.Entry pairs = (Map.Entry) journalIterator.next();
            int journalsAuthorIndex = authorsJournals.get(pairs.getKey()).getAuthorIndex();
            System.out.println("authorIndex = " + authorIndex);
            System.out.println("journalsAuthorIndex = " + journalsAuthorIndex);
            if (authorIndex == journalsAuthorIndex) {
                journalsAuthor += "\n Journal: ";
                value = pairs.getValue().toString();
                System.out.println("Found match: " + value);
                journalsAuthor += value;
                System.out.println("journalsAuthor = " + journalsAuthor);

            } else {
                System.out.println("Book not here");
            }

        }
        System.out.println("Books for author found = " + journalsAuthor);
        return journalsAuthor;
    }

    private static void getSortedAuthorIndex(ArrayList<Integer> authorsIndexList, ArrayList<String> authorsList) {
        for (int i = 0; i < authorsList.size(); i++) {
            String name = authorsList.get(i);
            name = reverseNameOrder(name);
            authorsList.set(i, name);
            List<String> list = new ArrayList<String>(Arrays.asList(name.split("\\s*:\\s*")));
            int authorIndexValue = Integer.parseInt(list.get(1));
            authorsIndexList.add(authorIndexValue);
            System.out.println("authorIndexValue = " + authorIndexValue);
        }
    }
    private static void getSortedBookByPrice(final Map bookMap) {

        List list = new LinkedList(bookMap.values());
        System.out.println("Before Sorting: " + list);
        // Custom Comparator
        Collections.sort(list, new Comparator() {
                @Override
                public int compare (Object o1, Object o2){
                    Book b1 = (Book) o1;
                    Book b2 = (Book) o2;

                    return ((Comparable) b1.getPrice()).compareTo(b2.getPrice());
            }
        });
        System.out.println("After Sorting: " + list);

    }


    private static String reverseNameOrder(String fullName) {
        String[] splitFullName = fullName.split(" ");
        return splitFullName[1] + " " + splitFullName[0] + " : " + splitFullName[3];
    }


}
