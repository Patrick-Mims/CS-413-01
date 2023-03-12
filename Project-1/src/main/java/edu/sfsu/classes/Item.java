package edu.sfsu.classes;

public abstract class Item {
    private final String itemName;
    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return String.format(getItemName());
    }
}
