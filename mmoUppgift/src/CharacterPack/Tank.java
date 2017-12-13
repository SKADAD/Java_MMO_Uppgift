package CharacterPack;

public class Tank {
    private int basePower;
    private int baseArmor;
    private int baseMana;
    private int baseHp;

    public Tank() {
        this.basePower = 25;
        this.baseArmor = 70;
        this.baseMana = 15;
        this.baseHp = 150;
    }

    public int shieldBlock(int armor){
        return armor *2;
    }

    public int shieldBash(int armor, int power){
        return armor+power;
    }

    public int getBasePower() {
        return basePower;
    }

    public int getBaseArmor() {
        return baseArmor;
    }

    public int getBaseMana() {
        return baseMana;
    }

    public int getBaseHp() {
        return baseHp;
    }
}
