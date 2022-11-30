package character;

import javax.swing.*;

public class Wizard extends Player {
    private int hitPoints = 95;
    private int defense = 60;
    private int baseAttack = 95;
    private ImageIcon wizardPic;

    public Wizard(String name){
        super(name);
        wizardPic = new ImageIcon(this.getClass().getResource("../images/wizard.jpg"));
    }

    // Getters
    public ImageIcon getWizardPic(){
        return wizardPic;
    }

    // Setters
    public void setWizardPic(ImageIcon wizardPic){
        this.wizardPic=wizardPic;
    }
}
