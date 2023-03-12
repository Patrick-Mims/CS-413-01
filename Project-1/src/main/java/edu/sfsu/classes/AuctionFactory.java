package edu.sfsu.classes;

/* Factories handle the details of object creation. */
public class AuctionFactory {
    /* createAuctionItem is the method all clients will use to instantiate new objects */
    public Item createAuctionItem(String type) {
        Item item = null;

        switch (type) {
            case "books":
                item = new Books();
                break;
            case "cars":
                item = new Cars();
                break;
            case "coins":
                item = new Coins();
                break;
            case "collectables":
                item = new Collectables();
                break;
        }
        return item;
    }
}
/* Classes that can be used to instantiate objects are called concrete classes. */