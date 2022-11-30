package character;

public abstract class Character {



    private String name;
    private int hitPoints;
    private int defense;
    private int baseAttack;

    // Empty Constructor
    public Character(){};

    public Character(String name){
        this.name=name;
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

}
