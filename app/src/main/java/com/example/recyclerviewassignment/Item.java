package com.example.recyclerviewassignment;

public class Item {
    private String name;
    private String likes;
    private String mb;
    private int imageResourceId;

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", likes='" + likes + '\'' +
                ", mb='" + mb + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }

    public Item(String name, String likes, String mb, int imageResourceId) {
        this.name = name;
        this.likes = likes;
        this.mb = mb;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getMb() {
        return mb;
    }

    public void setMb(String mb) {
        this.mb = mb;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
