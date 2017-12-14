package NpcPack;

public class Bosses {
    private String Name;
    private int BasePower;
    private int BaseArmor;
    private int BaseHp;
    private String Type;

    public Bosses(String Name, int basePower, int baseArmor, int baseHp, String Type) {
       this.Name = Name;
        BasePower = 50;
        BaseArmor = 65;
        BaseHp = 500;
        this.Type = Type;
    }

    public String getName() {
        return Name;
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

    public int attack(int Power){
        return Power;
    }
    public int special(int Power){
        return Power*3;
    }
}
