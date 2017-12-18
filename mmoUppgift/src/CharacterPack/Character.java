package CharacterPack;


import ItemPack.charItems;

import java.util.ArrayList;



public class Character {
    private String name;
    private String gender;
    private String fightclass;
    private int armor;
    private int hp;
    private int mana;
    private int power;
    private int attack1;
    private int attack2;
    private ArrayList<charItems> bag;
    private ArrayList<charItems> equipedItems;
    private ArrayList<character> friendList;
    private ArrayList<charItems> goldBank;

    public Character(String name, String gender, int classes) {
        this.name = name;
        this.gender = gender;
        this.bag = new ArrayList<>();
        this.equipedItems = new ArrayList<>();
        this.friendList = new ArrayList<>();
        this.goldBank = new ArrayList<>();
        if(classes ==0 ){
            Tank tank = new Tank();
            armor =tank.getBaseArmor();
            hp =tank.getBaseHp();
            mana =tank.getBaseMana();
            power=tank.getBasePower();
            attack1 = tank.shieldBash(armor,power);
            attack2 = tank.shieldBlock(armor);
            fightclass = "Tank";
        }
        if(classes ==1){
            Warrior warrior = new Warrior();
            armor =warrior.getBaseArmor();
            hp =warrior.getBaseHp();
            mana =warrior.getBaseMana();
            power =warrior.getBasePower();
            attack1 = warrior.rage(power);
            attack2 = warrior.excalibur(power,mana);
            fightclass ="Warrior";
        }
        if(classes ==2){
            Wizard wizard = new Wizard();
            armor = wizard.getBaseArmor();
            hp = wizard.getBaseHp();
            mana = wizard.getBaseMana();
            power = wizard.getBasePower();
            attack1 = wizard.lightningBolt(power);
            attack2 = wizard.heal(hp);
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

    public int getAttack1() {
        return attack1;
    }

    public int getAttack2() {
        return attack2;
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

    public ArrayList<charItems> getBag() {
        return bag;
    }

    public ArrayList<charItems> getEquipedItems() {
        return equipedItems;
    }

    public ArrayList<character> getFriendList() {
        return friendList;
    }

    public ArrayList<charItems> getGoldBank() {
        return goldBank;
    }

    public void setGoldBank(ArrayList<charItems> goldBank) {
        this.goldBank = goldBank;
    }
}
