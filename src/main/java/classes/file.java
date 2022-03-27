package classes;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;

public class file  extends JFrame implements ActionListener {
    Popup f;
    JFrame frame = new JFrame("File Comparer");
    JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    //Label to display selected name
    JLabel one = new JLabel("No file selected");



     public file(){

        //default frame and size informtion that would need to be changed later on for beautification
         frame.setSize(400,200);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //Open button that is used to open the file chooser
         JButton open = new JButton("Open");
         open.addActionListener(this);

         JPanel pan = new JPanel();

         //adds the button and the lable to the panel
         pan.add(open);
         pan.add(one);

         frame.add(pan);
         frame.setLocationRelativeTo(null);


            frame.show();


     }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
         //displays the frame made in the class
        frame.show();
       // JFileChooser j = new

        // restricts the type of files allowed
        file.setAcceptAllFileFilterUsed(false);

        //Title for the dialog
        file.setDialogTitle("Please select a file to compare");

       // FileNameExtensionFilter filter = new FileNameExtensionFilter("Only .txt files", ".txt");
        //file.addChoosableFileFilter(filter);


       //gets the first action committed
        String first = actionEvent.getActionCommand();

        //activates when open is selected
        //I left this open so we can add extra items later on

        if(first.equals("Open")){
            int check = file.showOpenDialog(null);
            //this takes in the path of the file selected
            one.setText(file.getSelectedFile().getAbsolutePath());
        }




    }
}

//
//public class pop {
//    // popup
//    Popup p;
//
//    // constructor
//    public pop()
//    {
//        // create a frame
//        JFrame f = new JFrame("File Comparer");
//
//        // create a label
//        JLabel l = new JLabel("This is a start");
//
//        f.setSize(400, 400);
//
//        PopupFactory pf = new PopupFactory();
//
//        // create a panel
//        JPanel p2 = new JPanel();
//
//        // set Background of panel
//        p2.setBackground(Color.red);
//
//        p2.add(l);
//
//        // create a popup
//        p = pf.getPopup(f, p2, 180, 100);
//
//        // create a button
//        JButton b = new JButton("click");
//
//        // add action listener
//        b.addActionListener(this);
//
//        // create a panel
//        // create a panel
//        JPanel p1 = new JPanel();
//
//        p1.add(b);
//        f.add(p1);
//        f.show();
//    }
//
//    // if the button is pressed
//    public void actionPerformed(ActionEvent e)
//    {
//        p.show();
//    }
//    // main class
////    public static void main(String args[])
////    {
////        pop p = new pop();
////    }
//}