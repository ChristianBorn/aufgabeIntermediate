package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public static String[] createArray() {
        String[] numberArray = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        return numberArray;
    }

    public static String returnNumberString(int index) {
        if (index != 0 && index <= 10) {
            return createArray()[index -1];
        }
        return "Der Index muss zwischen 1 und 10 liegen";
    }
}