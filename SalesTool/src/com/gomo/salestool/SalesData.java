package com.gomo.salestool;

public class SalesData {

    int data[] = { 1, 4, 5, 6 };

    public void display() {
        System.out.println("Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Next value: " + data[i]);
        }
    }

}
