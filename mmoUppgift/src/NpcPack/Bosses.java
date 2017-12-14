package NpcPack;

public class Bosses {
    private int BasePower;
    private int BaseArmor;
    private int BaseHp;

    public Bosses(int basePower, int baseArmor, int baseHp) {
        BasePower = 40;
        BaseArmor = 50;
        BaseHp = 500;
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
