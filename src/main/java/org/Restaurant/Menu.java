package org.Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date dateUpdated;
    public ArrayList<MenuItem> items;

    private LocalDate currentDate = LocalDate.now();

    public Menu(ArrayList<MenuItem> items){
        this.items = items;
    }

    public void addItem(MenuItem itemBeingAdded){
        this.items.add(itemBeingAdded);
    }

    public void removeItem(MenuItem itemBeingRemoved){
        this.items.remove(itemBeingRemoved);
    }

    public String lastUpdated(){
        return this.currentDate.toString();
    }

    public void printAllItems(){
        System.out.println("test works");
        }


    }











