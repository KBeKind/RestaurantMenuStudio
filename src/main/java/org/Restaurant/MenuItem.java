package org.Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class MenuItem {

    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private String name;
    private boolean isAvailable;
    private LocalDate dateAdded;

    public MenuItem(String name, String description, double price, String category, boolean isAvailable, boolean isNew,
                    LocalDate dateAdded) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isAvailable = isAvailable;
        this.isNew = isNew;
        this.dateAdded = dateAdded;

    }

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

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }


    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null || getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem aMenuItem = (MenuItem) toBeCompared;
        return getName().equals(aMenuItem.getName());
    }

    @Override
    public String toString() {
        return this.name + ": " + this.description + " | price: $" + price + " | category: " + category +
                " | availability: " + this.isAvailable + " | New?: " + this.isNew + " | Date added: " + this.dateAdded;
    }






}



