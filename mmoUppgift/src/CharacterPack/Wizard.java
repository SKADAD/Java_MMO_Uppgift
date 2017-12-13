package CharacterPack;

public class Wizard {
    private int basePower;
    private int baseArmor;
    private int baseMana;
    private int baseHp;

    public Wizard(int basePower, int baseArmor, int baseMana, int baseHp) {
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

    public int LightningBold(int Power){
        return Power*3;
    }

    public int Heal(int HP){
        return HP;
    }
}
