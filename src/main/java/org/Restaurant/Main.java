package org.Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        String[] testAllergensArray = {"gluten", "dairy"};

        MenuItem sandwich = new MenuItem(
                "chicken sandwich","a chicken sandwich on bread", 10.50, "main course",
                true, true,currentDate);

        MenuItem sandwich2 = new MenuItem(
                "chicken sandwich2","a chicken sandwich on bread", 10.50, "main course",
                true, true,currentDate);

        ArrayList<MenuItem> testList = new ArrayList<>();

        Menu testMenu = new Menu(testList);

        testMenu.addItem(sandwich);
        testMenu.addItem(sandwich2);

        testMenu.printAllItems();

        System.out.println(testMenu.getDateUpdated());

        testMenu.removeItem(sandwich2);

        System.out.println(testMenu.getDateUpdated());




    }





}