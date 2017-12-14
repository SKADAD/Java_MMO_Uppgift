package ItemPack;

public class CharItems {
    private String ItemName;
    private String SubType;


    public CharItems(String itemName, String subType) {
        ItemName = itemName;
        SubType = subType;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getSubType() {
        return SubType;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public void setSubType(String subType) {
        SubType = subType;
    }
}
