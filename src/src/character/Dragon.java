package character;

import javax.swing.*;

public class Dragon extends Monster{
    private int hitPoints = 80;
    private int defense = 80;
    private int baseAttack = 75;
    private ImageIcon dragonPic;

    public Dragon(String name){
        super(name);
        dragonPic = new ImageIcon(this.getClass().getResource("/images/dragon.jpg"));
    }

    // Getters
    public ImageIcon getDragonPic(){
        return dragonPic;
    }

    // Setters
    public void setDragonPic(ImageIcon dragonPic){
        this.dragonPic=dragonPic;
    }
}
