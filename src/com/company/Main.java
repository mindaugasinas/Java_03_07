package com.company;

import java.util.Scanner;

public class Main {
    public int[] masyvas;

    public void Ivedimas() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Nurodykite kiek skaiciu irasysite ");

        int a = sc.nextInt();

        masyvas = new int[a];
        System.out.println("Iveskite  " + a + " skaicius");

        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = sc.nextInt();

        }
    }

    public void isvedimas() {
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 100) {
                System.out.println(masyvas[i]);
            }
        }
    }

    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.Ivedimas();
        objektas.isvedimas();
    }
}
