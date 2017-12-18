package NpcPack;

public class Mobs extends Npc {
    private String name;
    private int basePower;
    private int baseArmor;
    private int baseHp;
    private String type;

    public Mobs(String Name, int basePower, int baseArmor, int baseHp) {
        this.name = Name;
        this.basePower = 35;
        this.baseArmor = 15;
        this.baseHp = 120;
        this.type = type;

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

    public int attack(int Power) {
        return Power;
    }

    public String typeToReturn(String input) {
        String Type = "";
        if (input == "1") {
            Type = "Wolf";
        } else if (input == "2") {
            Type = "Spider";
        } else if (input == "3") {
            Type = "Zombie";
        } else if (input == "4") {
            Type = "Humanoid";
        }
        return Type;
    }


}