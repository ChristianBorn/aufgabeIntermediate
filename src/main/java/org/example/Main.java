package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printNumbersBetween1and100Test();

    }

    public static String[] createArray() {
        String[] numberArray = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        return numberArray;
    }

    public static String returnNumberString(int index) {
        if (index != 0 && index <=10) {
            return createArray()[index -1];
        }
        return "Der Index muss zwischen 1 und 10 liegen";
    }

  public static String[] printNumbersBetween1and100Test(){
        String[] result = new String[100];

        for (int i=1;i<=100;i++){

            if(i%3==0 && i%5==0){
                result[i-1]="?"+i;

            } else if (i%3==0) {
                result[i-1]="#"+i;

            } else if (i%5==0) {
                result[i-1]="$"+i;
            } else {
                result[i-1]=String.valueOf(i);
            }
        }

        return result;
    }
}