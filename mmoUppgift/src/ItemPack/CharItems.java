package ItemPack;

public class CharItems {
    private String itemName;
    private String subType;


    public CharItems(String itemName, String subType) {
        this.itemName = itemName;
        this.subType = subType;
    }

    public String getItemName() {
        return itemName;
    }

    public String getSubType() {
        return subType;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
}
