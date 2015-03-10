package com.comp3717.comp3717markulate;


import java.io.Serializable;

public class Item implements Serializable {

    private String itemName = "";
    private String category = "";
    private double weight;

    //constructor
    public Item(String itemName, String category, double weight){
        this.itemName = itemName;
        this.category = category;
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
