package com.example.project_prm.Domain;

public class FoodDomain {
    private String title;
    private String img;
    private String description;
    private Double fee;
    private int star;
    private int time;
    private int calories;
    private int numberInCart;

    public FoodDomain(String title, String img, String description, Double fee, int star, int time, int calories) {
        this.title = title;
        this.img = img;
        this.description = description;
        this.fee = fee;
        this.star = star;
        this.time = time;
        this.calories = calories;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
