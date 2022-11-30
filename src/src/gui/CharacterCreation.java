package gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class CharacterCreation extends JPanel {

    // Character Creation Text Fields
    private JTextField characterName = new JTextField(15);
    private JTextField characterHp = new JTextField(5);
    private JTextField characterDefense = new JTextField(5);
    private JTextField characterAgility = new JTextField(5);
    private JTextField characterBaseAttack = new JTextField(5);


    // Weapon Text Field
    private JTextField weaponAttackMod = new JTextField(5);
    private JTextField weaponWeight = new JTextField(5);

    // Description of Class and Weapons
    private JTextArea characterClassDescrip = new JTextArea(5,20);
    private JTextArea weaponDescrip = new JTextArea(5,20);

    // Character Labels
    private final JLabel enterCharacterName = new JLabel("Enter Name");
    private final JLabel characterType = new JLabel("Character Type");
    private final JLabel characterStats = new JLabel("Character Stats");
    private final JLabel selectWeapon = new JLabel("Select Weapon");
    private final JLabel weaponStats = new JLabel("Weapon Stats");

    // Character Label and Stats


    // Adding to panel
    public CharacterCreation(){
        add(characterName);
        add(characterHp);
        add(characterDefense);
        add(characterAgility);
        add(characterBaseAttack);
        add(weaponAttackMod);
        add(weaponWeight);
        add(characterClassDescrip);
        add(weaponDescrip);
        add(enterCharacterName);
        add(characterType);
        add(characterStats);
        add(selectWeapon);
        add(weaponStats);
    }
}
