package NpcPack;

public class Bosses extends Npc {
    private String name;
    private int basePower;
    private int baseArmor;
    private int baseHp;
    private String type;

    public Bosses(String Name, int basePower, int baseArmor, int baseHp, String Type) {
       this.name = Name;
        this.basePower = 50;
        this.baseArmor = 65;
        this.baseHp = 500;
        this.type = Type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getBasePower() {
        return basePower;
    }

    public int getBaseArmor() {
        return baseArmor;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public int attack(int Power){
        return Power;
    }
    public int special(int Power){
        return Power*3;
    }

    public String typeToReturn(String dungeon){
        String Type = "";
        if(dungeon == "1"){
            Type = "Yeti";
        }
        else if(dungeon == "2"){
            Type = "Demon";
        }
        else if(dungeon == "3"){
            Type = "Gargantuan";
        }
        else if(dungeon == "4"){
            Type = "Dragon";
        }
        return Type;

    }
}
