package com.comp3717.comp3717markulate;


import android.widget.Button;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseName = "";
    private String category = "";
    private String item = "";
    private double weight;
    private Button editButton = null;

    //constructor called when add button is pressed without new Button
    public Course(String courseName) {
        this.courseName = courseName;
        this.category = null;
        this.item = null;
        this.weight = 0;
    }
    //constructor without the new button
    public Course(String courseName, String category, String item, double weight) {
        this.courseName = courseName;
        this.category = category;
        this.item = item;
        this.weight = weight;
    }

    //constructor with a new button
    public Course(String courseName, String category, String item, double weight,Button editButton) {
        this.courseName = courseName;
        this.category = category;
        this.item = item;
        this.weight = weight;
        this.editButton = editButton;
    }


    public Button getEditButton() {
        return editButton;
    }

    public void setEditButton(Button editButton) {
        this.editButton = editButton;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
