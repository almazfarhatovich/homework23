package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int counter = random.nextInt(100);
            if (counter % 2 == 0) {
                arrayList1.add(counter);
            }
            if (counter % 2 != 0) {
                arrayList2.add(counter);
            }
            System.out.print(counter + " ");
        }
        System.out.println("\nЖуп сандар: " + arrayList1);
        System.out.println("Так сандар: " + arrayList2);
    }
}
