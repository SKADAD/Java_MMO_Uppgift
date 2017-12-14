package ItemPack;

public class EquipableItems {
    private String Helm;
    private String Cloak;
    private String Weapon;

    public EquipableItems(String helm, String cloak, String weapon) {
        Helm = helm;
        Cloak = cloak;
        Weapon = weapon;
    }

    public String getHelm() {
        return Helm;
    }

    public String getCloak() {
        return Cloak;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setHelm(String helm) {
        Helm = helm;
    }

    public void setCloak(String cloak) {
        Cloak = cloak;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }
}
