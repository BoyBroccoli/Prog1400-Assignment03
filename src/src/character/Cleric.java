package character;

import javax.swing.*;

public class Cleric extends Player{
    private int hitPoints = 65;
    private int defense = 80;
    private int baseAttack = 70;
    private ImageIcon clericPic;

    public Cleric(String name){
        super(name);
        clericPic = new ImageIcon(this.getClass().getResource("../images/cleric.jpg"));
    }

    // Getters
    public ImageIcon getClericPic(){
        return clericPic;
    }

    // Setters
    public void setClericPic(ImageIcon clericPic){
        this.clericPic=clericPic;
    }

}
