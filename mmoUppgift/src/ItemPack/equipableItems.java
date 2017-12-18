package ItemPack;

public class equipableItems {
    private String helm;
    private String cloak;
    private String weapon;

    public equipableItems(String helm, String cloak, String weapon) {
        this.helm = helm;
        this.cloak = cloak;
        this.weapon = weapon;
    }

    public String getHelm() {
        return helm;
    }

    public String getCloak() {
        return cloak;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setHelm(String helm) {
        this.helm = helm;
    }

    public void setCloak(String cloak) {
        this.cloak = cloak;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int MasterSwordAndMirrorShield(int Stats){
        int powerStat = 50;
        return powerStat;
    }
}
