package CharacterPack;


import ItemPack.CharItems;
import ItemPack.CharItems;

import java.util.ArrayList;



public class Character {
    private String name;
    private String gender;
    private String fightclass;
    private int armor;
    private int hp;
    private int mana;
    private int power;
    private ArrayList<CharItems> bag;
    private ArrayList<CharItems> equipedItems;
    private ArrayList<Character> friendList;

    public Character(String name, String gender,int classes) {
        this.name = name;
        this.gender = gender;
        this.bag = new ArrayList<>();
        this.equipedItems = new ArrayList<>();
        this.friendList = new ArrayList<>();
        if(classes ==0 ){
            Tank tank = new Tank();
            armor =tank.getBaseArmor();
            hp =tank.getBaseHp();
            mana =tank.getBaseMana();
            power=tank.getBasePower();
            fightclass = "Tank";
        }
        if(classes ==1){
            Warrior warrior = new Warrior();
            armor =warrior.getBaseArmor();
            hp =warrior.getBaseHp();
            mana =warrior.getBaseMana();
            power =warrior.getBasePower();
            fightclass ="Warrior";
        }
        if(classes ==2){
            Wizard wizard = new Wizard();
            armor = wizard.getBaseArmor();
            hp = wizard.getBaseHp();
            mana = wizard.getBaseMana();
            power = wizard.getBasePower();
            fightclass = "Wizard";
        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getFightclass() {
        return fightclass;
    }

    public int getArmor() {
        return armor;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getPower() {
        return power;
    }

    public ArrayList<CharItems> getBag() {
        return bag;
    }

    public ArrayList<CharItems> getEquipedItems() {
        return equipedItems;
    }

    public ArrayList<Character> getFriendList() {
        return friendList;
    }
}
