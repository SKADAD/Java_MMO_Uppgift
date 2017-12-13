package CharacterPack;


import ItemPack.Items;

import java.util.ArrayList;



public class Character {
    private String name;
    private String gender;
    private int[];
    private ArrayList<Items> bag;
    private ArrayList<Items> equipedItems;
    private ArrayList<Character> friendList;

    public Character(String name, String gender,int classes) {
        this.name = name;
        this.gender = gender;
        this.bag = new ArrayList<>();
        this.equipedItems = new ArrayList<>();
        this.friendList = new ArrayList<>();
        if(classes ==0 ){
            Tank tank = new Tank();
        }
        if(classes ==1){
            Warrior warrior = new Warrior();
        }
        if(classes ==2){
            Wizard wizard = new Wizard();
        }
    }


}
