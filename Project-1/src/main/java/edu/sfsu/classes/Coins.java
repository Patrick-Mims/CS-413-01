package edu.sfsu.classes;

public class Coins extends AuctionHouse {

    public Coins() {
        super(factory);
    }

    @Override
    Item createAuctionItem(String type) {
        return null;
    }
}
