package character;

import javax.swing.*;

public class Warrior extends Player{
    private int hitPoints = 85;
    private int defense = 60;
    private int baseAttack = 90;
    private ImageIcon warriorPic;

    public Warrior(String name){
        super(name);
        warriorPic = new ImageIcon(this.getClass().getResource("../images/afro_samurai.jpg"));
    }

    // Getters
    public ImageIcon getWarriorPic(){
        return warriorPic;
    }

    // Setters
    public void setWarriorPic(ImageIcon warriorPic){
        this.warriorPic=warriorPic;
    }
}
