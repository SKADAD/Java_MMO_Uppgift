package ItemPack;

import CharacterPack.Character;

public class ConsumableItems extends CharItems {
    private String healingPot;
    private String manaPot;

    public ConsumableItems(String itemName, String subType, String healingPot, String manaPot) {
        super(itemName,subType);
        this.healingPot = healingPot;
        this.manaPot = manaPot;
    }

    public String getHealingPot() {
        return healingPot;
    }

    public String getManaPot() {
        return manaPot;
    }

    public void setHealingPot(String healingPot) {
        this.healingPot = healingPot;
    }

    public void setManaPot(String manaPot) {
        this.manaPot = manaPot;
    }
}
