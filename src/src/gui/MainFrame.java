package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import character.*;

public class MainFrame extends JFrame {

    //class variables
    //private ChoosePanel choosePane;
    //private DisplayPanel displayPane;

    public static Warrior warrior;
    public static Cleric cleric;
    public static Wizard wizard;

    // Constructor
    public MainFrame(){
        initialize();
    }


    // Method Initializer to build MainFrame
    public void initialize(){

        // Setting the Title
        this.setTitle("DND Game");

        // When user clicks the x
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Setting size of MainFrame
        setBounds(200,200,800,700);

        // Displaying MainFrame
        setVisible(true);

        // Adding SplashScreen to the MainFrame
        SplashScreen splashScreen = new SplashScreen();

        add(splashScreen);

        // Adding CharacterCreation Panel
        CharacterCreation characterCreation = new CharacterCreation();
        characterCreation.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        characterCreation.setBackground(Color.blue);
        //MainFrame.add(characterCreation, BoarderLayout.CENTER);
    }



}
