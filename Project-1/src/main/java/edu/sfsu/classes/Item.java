package edu.sfsu.classes;

public abstract class Item {
    private final String itemName = null;

    public String getItemName() {
        return null;
    }

    @Override
    public String toString() {
        return String.format(getItemName());
    }

    abstract Item createAuctionItem();
}
