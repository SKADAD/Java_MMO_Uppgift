package VendorPack;

import CharacterPack.Character;
import ItemPack.CharItems;

import java.util.ArrayList;

public class Auction {
    private ArrayList<CharItems> auctionsList;
    private ArrayList<Character> sellerList;

    public Auction(ArrayList<CharItems> auctionsList, ArrayList<Character> sellerList) {
        this.auctionsList = new ArrayList<>();
        this.sellerList = new ArrayList<>();
    }

    public ArrayList<CharItems> getAuctionsList() {
        return auctionsList;
    }

    public void setAuctionsList(ArrayList<CharItems> auctionsList) {
        this.auctionsList = auctionsList;
    }

    public ArrayList<Character> getSellerList() {
        return sellerList;
    }

    public void setSellerList(ArrayList<Character> sellerList) {
        this.sellerList = sellerList;
    }
}

