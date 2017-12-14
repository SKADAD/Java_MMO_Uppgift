package NpcPack;

import java.util.ArrayList;

public class Mobs {
    private String Name;
    private int BasePower;
    private int BaseArmor;
    private int BaseHp;
    private boolean Neutral;
    private String Type;

    public Mobs(String Name, int basePower, int baseArmor, int baseHp, boolean Neutral) {
        this.Name = Name;
        BasePower = 35;
        BaseArmor = 15;
        BaseHp = 120;
        Neutral = false;
        this.Type = Type;

    }

    public String getName() {
        return Name;
    }

    public boolean isNeutral() {
        return Neutral;
    }

    public String getType() {
        return Type;
    }

    public int getBasePower() {
        return BasePower;
    }

    public int getBaseArmor() {
        return BaseArmor;
    }

    public int getBaseHp() {
        return BaseHp;
    }

    public int attack(int Power) {
        return Power;
    }

    public String typeToReturn(String Input) {
        String Type = "";
        if (Input == "1") {
            Type = "Wolf";
        } else if (Input == "2") {
            Type = "Spider";
        } else if (Input == "3") {
            Type = "Zombie";
        } else if (Input == "4") {
            Type = "Humanoid";
        }
        return Type;
    }


}