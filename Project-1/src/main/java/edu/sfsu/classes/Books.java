package edu.sfsu.classes;

import edu.sfsu.interfaces.Book;

public class Books extends Item {
    private String author;
    private String condition;
    private String title;
    private int published;
    public Books() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    @Override
    Item createAuctionItem() {
        return null;
    }
}
