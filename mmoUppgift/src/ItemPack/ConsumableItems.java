package ItemPack;

public class ConsumableItems {
    private String HealingPot;
    private String ManaPot;

    public ConsumableItems(String healingPot, String manaPot) {
        HealingPot = healingPot;
        ManaPot = manaPot;
    }

    public String getHealingPot() {
        return HealingPot;
    }

    public String getManaPot() {
        return ManaPot;
    }

    public void setHealingPot(String healingPot) {
        HealingPot = healingPot;
    }

    public void setManaPot(String manaPot) {
        ManaPot = manaPot;
    }
}
