/**
 * file name FileReaderLIMS
 * date      29 Mar 2015
 * author    Stephen Drollinger
 * purpose   Generic file to take input files and read them into an arraylist
 *
 */
import java.io.*;
import java.util.ArrayList;

// class to read file in line by line
public class FileReaderLIMS {

    // location of file
    private String fileLocation;

    // Array list to put each line in
    static private ArrayList<String> inputFile = new ArrayList<String>();

    // Constructor for Arraylist
    public FileReaderLIMS(SimpleFileChooser sfc, ArrayList<String> aL1) {
        inputFile = aL1;
        fileLocation = sfc.getFileChoice();
    }

    // getter
    public ArrayList getInputFile() {
        try {
            // Open the file that is the first 
            // command line parameter
            FileInputStream fstream = new FileInputStream(fileLocation);
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                System.out.println(strLine);
                inputFile.add(strLine);
            }
            //Close the input stream
            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        //printInputFile();
        //System.out.println("Reached end of getInputFile");
        //System.out.println("Size of inputFile" + inputFile.size());
        return inputFile;
    }

    // formatting output of input file from ArrayList
    public static void printInputFile() {
        for (int i = 0; i < inputFile.size(); ++i) {
            System.out.println(inputFile.get(i));
        }
    }
}
