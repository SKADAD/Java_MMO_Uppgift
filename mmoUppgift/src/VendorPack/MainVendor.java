package VendorPack;

import ItemPack.CharItems;

import java.util.ArrayList;

public class MainVendor {
    private ArrayList<CharItems> sellableItems;

    public MainVendor(ArrayList<CharItems> sellableItems) {
        this.sellableItems = new ArrayList<>();
    }

    public ArrayList<CharItems> getSellableItems() {
        return sellableItems;
    }

    public void setSellableItems(ArrayList<CharItems> sellableItems) {
        this.sellableItems = sellableItems;
    }
}