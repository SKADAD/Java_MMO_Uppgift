package VendorPack;

import CharacterPack.character;
import ItemPack.charItems;

import java.util.ArrayList;

public class Auction {
    private ArrayList<charItems> auctionsList;
    private ArrayList<character> sellerList;

    public Auction(ArrayList<charItems> auctionsList, ArrayList<character> sellerList) {
        this.auctionsList = new ArrayList<>();
        this.sellerList = new ArrayList<>();
    }

    public ArrayList<charItems> getAuctionsList() {
        return auctionsList;
    }

    public void setAuctionsList(ArrayList<charItems> auctionsList) {
        this.auctionsList = auctionsList;
    }

    public ArrayList<character> getSellerList() {
        return sellerList;
    }

    public void setSellerList(ArrayList<character> sellerList) {
        this.sellerList = sellerList;
    }
}

