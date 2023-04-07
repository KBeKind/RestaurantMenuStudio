package org.Restaurant;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Menu {

    private String dateUpdated;
    public ArrayList<MenuItem> items;

    private LocalDateTime currentDate = LocalDateTime.now();

    public Menu(ArrayList<MenuItem> items){
        this.items = items;
    }

    public void addItem(MenuItem itemBeingAdded){
        this.items.add(itemBeingAdded);
        this.newUpdate();
    }

    public void removeItem(MenuItem itemBeingRemoved){
        this.items.remove(itemBeingRemoved);
        this.newUpdate();
    }

    public void newUpdate(){
        currentDate = LocalDateTime.now();
        this.dateUpdated = this.currentDate.toString();
    }

    public void printAllItems(){
        for (MenuItem mI : items) {
            System.out.println(mI);
        }
    }
    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}











