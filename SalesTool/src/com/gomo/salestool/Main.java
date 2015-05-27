package com.gomo.salestool;

public class Main {

    public static void main(String[] args) {
        final SalesData data = new SalesData();
        displayGreeting();
        data.display();
    }

    private static void displayGreeting() {
        System.out.println("HELLO, HAPPY SALES PEOPLE");
        System.out.println("This app show sales data");
        System.out.println("---------------------------");

        System.out.println("Test 1");
        System.out.println("Test 2");
    }

}
