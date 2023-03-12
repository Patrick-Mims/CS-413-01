package edu.sfsu.classes;

public class AuctionHouse {
    // Define a reference to AuctionFactory
    AuctionFactory factory;

    // AuctionHouse gets the factory passed to it in the constructor
    public AuctionHouse(AuctionFactory factory) {
       this.factory = factory;
    }
    public Item orderItem(String type) {
        Item item;

        item = factory.createAuctionItem(type);

        return item;
    }
}
