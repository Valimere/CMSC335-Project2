/**
 * file name SimpleFileChooser
 * date      29 Mar 2015
 * author    Stephen Drollinger
 * purpose   user can choose file from a standard gui
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class SimpleFileChooser extends JFrame {

    private String fileChoice;

    public String getFileChoice() {
        return fileChoice;
    }

    public SimpleFileChooser() {
        super("Input File Selection");
        setSize(350, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton openButton = new JButton("Open");
        //JButton saveButton = new JButton("Save");
        //JButton dirButton = new JButton("Pick Dir");
        final JLabel statusbar
                = new JLabel("Please select your input file");

        // Create a file chooser that opens up as an Open dialog
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser chooser = new JFileChooser();
                chooser.setMultiSelectionEnabled(true);
                int option = chooser.showOpenDialog(SimpleFileChooser.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File[] sf = chooser.getSelectedFiles();
                    String filelist = "nothing";
                    if (sf.length > 0) {
                        filelist = sf[0].getAbsolutePath();
                    }
                    for (int i = 1; i < sf.length; i++) {
                        filelist += ", " + sf[i].getAbsolutePath();
                    }
                    statusbar.setText("You chose " + filelist);

                    // assigning choice to be passed up
                    fileChoice = filelist;

                } else {
                    statusbar.setText("You canceled.");
                }
            }
        });

        c.add(openButton);
        c.add(statusbar);
    }

    /*
    public static void main(String args[]) {
        SimpleFileChooser sfc = new SimpleFileChooser();
        
        while (fileChoice == null) {
            sfc.setVisible(true);
        }
        sfc.setVisible(false);

        System.out.println(fileChoice);

    }
    */

}
