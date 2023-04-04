package org.Restaurant;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

    }
}
