package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashScreen extends JPanel {

    public SplashScreen(){
        initializer();
    }

    public void initializer(){
        JButton button = new JButton("Build a Character");
        JLabel title = new JLabel("RPG Maker");
        JLabel splash = new JLabel("");
        title.setFont(new Font("Serif", Font.PLAIN,30));
        button.setFont(new Font("Serif", Font.PLAIN,20));
        button.setFocusable(false);
        button.setToolTipText("Click here to create a character!");
        splash.setIcon(new ImageIcon(getClass().getResource("../Images/splashScreenLogo.jpg")));
        setLayout(null);
        title.setBounds(300,50,200,100);
        add(title);
        splash.setBounds(100,150,800,300);
        add(splash);
        button.setBounds(265,500,200,50);
        add(button);

        CharacterCreation charCreation = new CharacterCreation();

        add(charCreation);
        button.addActionListener(new ActionListener() {

            // Will execute when button is clicked on
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                splash.setVisible(false);

                charCreation.setVisible(true);
                //add(charCreation);
            }
        });
    }


    /*
    public void createCharacter(ActionListener actionListener){
        button.addActionListener(actionListener);
    }*/
}
