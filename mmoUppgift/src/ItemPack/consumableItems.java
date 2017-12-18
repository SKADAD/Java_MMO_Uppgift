package ItemPack;

public class consumableItems {
    private String healingPot;
    private String manaPot;

    public consumableItems(String healingPot, String manaPot) {
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
