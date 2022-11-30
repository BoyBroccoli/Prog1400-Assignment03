package character;

import javax.swing.*;

public abstract class Monster extends Character{

    private String name;
    private int hitPoints = 75;
    private int defense = 55;
    private int baseAttack = 80;
    private ImageIcon monsterPic;

    // Empty Constructor
    public Monster(){};

    public Monster(String name){
        this.name=name;
        monsterPic = new ImageIcon(this.getClass().getResource("/images/dragon.jpg"));
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDefense() {
        return defense;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public ImageIcon getMonsterPic(){
        return monsterPic;
    }


    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public void setDragonPic(ImageIcon monsterPic){
        this.monsterPic=monsterPic;
    }

}
