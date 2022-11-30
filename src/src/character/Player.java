package character;

public class Player extends Character {

    private int hitPoints = 75;
    private int defense = 75;
    private int baseAttack = 50;
    // empty constructor
    public Player(){};

    // Constructor
    public Player(String name){
       super(name);
    }
}
