package com.comp3717.comp3717markulate;


import java.io.Serializable;

public class Item implements Serializable {

    String itemName = "";
    private double weight;

    //constructor
    public Item(String itemName, double weight){
        this.itemName = itemName;
        this.weight = weight;
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
