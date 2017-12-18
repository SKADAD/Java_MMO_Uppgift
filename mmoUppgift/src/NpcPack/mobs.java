package NpcPack;

public class mobs {
    private String name;
    private int basePower;
    private int baseArmor;
    private int baseHp;
    private boolean neutral;
    private String type;

    public mobs(String Name, int basePower, int baseArmor, int baseHp, boolean Neutral) {
        this.name = Name;
        this.basePower = 35;
        this.baseArmor = 15;
        this.baseHp = 120;
        this.neutral = false; // Ska vi ha neutral mobs? Står inte som krav så vi kan skippa det krånglet :D:D:D:D:D
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public boolean isNeutral() {
        return neutral;
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