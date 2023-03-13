package edu.sfsu.classes;

public abstract class AuctionHouse {
    // Define a reference to AuctionFactory
    AuctionFactory factory;

    // AuctionHouse gets the factory passed to it in the constructor
    public AuctionHouse(AuctionFactory factory) {
       this.factory = factory;
    }
    public Item orderItem(String type) {
        Item item;

        item = createAuctionItem(type);

        return item;
    }
    abstract Item createAuctionItem(String type);
}
