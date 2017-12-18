package CharacterPack;



public class Warrior{
    private int basePower;
    private int baseArmor;
    private int baseMana;
    private int baseHp;

    public Warrior() {
        super();

        this.basePower = 40;
        this.baseArmor = 25;
        this.baseMana = 10;
        this.baseHp = 100;

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

    public int rage(int Power) {
        return Power * 3;
    }

    public int excalibur(int Power, int Mana){
        return Power*Mana;
    }

}
