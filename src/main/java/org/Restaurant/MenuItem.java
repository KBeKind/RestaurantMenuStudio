package org.Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {

    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private String name;
    private boolean isAvailable;
    private boolean isVegan;
    private boolean isGlutenFree;
    private Date dateAdded;
    private ArrayList<String> allergens;
    private int spiceLevel;
    private String proteinType;

    public MenuItem(String description, double price, String category, boolean isNew, String name, boolean isAvailable, boolean isVegan, Date dateAdded, ArrayList<String> allergens, int spiceLevel, String proteinType) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
        this.name = name;
        this.isAvailable = isAvailable;
        this.isVegan = isVegan;
        this.dateAdded = dateAdded;
        this.allergens = allergens;
        this.spiceLevel = spiceLevel;
        this.proteinType = proteinType;
    }




    //Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public ArrayList<String> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }

    public int getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(int spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setProteinType(String proteinType) {
        this.proteinType = proteinType;
    }

}
