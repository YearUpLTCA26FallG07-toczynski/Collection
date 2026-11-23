
package com.pluralsight.collection;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        // Create an Integer list
        FixedList<Integer> numbers = new FixedList<>(3);

        numbers.add(10);
        numbers.add(3);
        numbers.add(92);

        System.out.println("Numbers: " + numbers.getItems());
        System.out.println("Number of items: " + numbers.getItems().size());

        // This should fail because the list is full
        try {
            numbers.add(43);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Create a LocalDate list
        FixedList<LocalDate> dates = new FixedList<>(2);

        dates.add(LocalDate.now());
        dates.add(LocalDate.now());

        System.out.println("Dates: " + dates.getItems());

        // This should fail because 15 is not a LocalDate
        // dates.add(15);

        try {
            dates.add(null);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
