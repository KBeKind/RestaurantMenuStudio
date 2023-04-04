package org.Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem getMostRecent() {
        return mostRecent;
    }

    public void setMostRecent(MenuItem mostRecent) {
        this.mostRecent = mostRecent;
    }

    private Date dateUpdated;
    private ArrayList<MenuItem> items;
    private MenuItem mostRecent;



}
