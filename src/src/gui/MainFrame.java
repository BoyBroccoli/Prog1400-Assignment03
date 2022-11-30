package gui;

import javax.swing.*;
import character.*;

public class MainFrame extends JFrame {

    //class variables
    //private ChoosePanel choosePane;
    //private DisplayPanel displayPane;

    public static Warrior warrior;
    public static Cleric cleric;
    public static Wizard wizard;

    // Constructor
    public MainFrame() {

        this.setTitle("DND Game");
        //close the application when they close the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set the size of the frame
        this.setBounds(100, 100, 700, 600);
    }
}
