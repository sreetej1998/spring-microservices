package com.example.moviecatalogservice.modal;

public class CatalogItem {
    int rating;
    String desc;

    public int getRating() {
        return rating;
    }

    public CatalogItem(int rating, String desc, String name) {
        this.rating = rating;
        this.desc = desc;
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
