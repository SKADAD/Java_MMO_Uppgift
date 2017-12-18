package VendorPack;

public class MainVendor {
    private ArrayList<charitems> sellableItems;

    public MainVendor(ArrayList<charitems> sellableItems) {
        this.sellableItems = new ArrayList<>();
    }

    public ArrayList<charitems> getSellableItems() {
        return sellableItems;
    }

    public void setSellableItems(ArrayList<charitems> sellableItems) {
        this.sellableItems = sellableItems;
    }
}