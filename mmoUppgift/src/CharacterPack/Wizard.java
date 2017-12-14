package CharacterPack;

public class Wizard {
    private int basePower;
    private int baseArmor;
    private int baseMana;
    private int baseHp;

    public Wizard() {
        this.basePower = 10;
        this.baseArmor = 10;
        this.baseMana = 50;
        this.baseHp = 80;
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

    public int LightningBolt(int Power){
        return Power*3;
    }

    public int Heal(int HP){
        return HP/2;
    }
}
