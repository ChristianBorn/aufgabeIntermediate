package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void checkArray3() {
        int index = 3;

        String actual = Main.createArray()[index];
        String expected = "Vier";

        assertEquals(expected, actual);
    }

    @Test
    public void checkArray9() {
        int index = 9;

        String actual = Main.createArray()[index];
        String expected = "Zehn";

        assertEquals(expected, actual);
    }

    @Test
    public void checkArrayNumberString5() {
        int index = 5;

        String actual = Main.returnNumberString(index);
        String expected = "Fünf";

        assertEquals(expected, actual);
    }
    @Test
    public void checkArrayNumberString0() {
        int index = 0;

        String actual = Main.returnNumberString(index);
        String expected = "Der Index muss zwischen 1 und 10 liegen";

        assertEquals(expected, actual);
    }

    @Test
    public void printNumbers0Test() {
        int testNumber= 0;

        String actual = Main.printNumbersBetween1and100Test()[0];
        String expected = "1";

        assertEquals(expected, actual);
    }

    @Test
    public void printNumbers100Test() {
        String actual = Main.printNumbersBetween1and100Test()[99];
        String expected = "$100";

        assertEquals(expected, actual);
    }

    @Test
    public void printNumbersDivisibleBy3() {
        String actual = Main.printNumbersBetween1and100Test()[8];
        String expected = "#9";

        assertEquals(expected, actual);
    }

    @Test
    public void printNumbersDivisibleBy15() {
        String actual = Main.printNumbersBetween1and100Test()[14];
        String expected = "?15";

        assertEquals(expected, actual);
    }

    @Test
    public void printNumbersDivisibleBy5() {
        String actual = Main.printNumbersBetween1and100Test()[4];
        String expected = "$5";

        assertEquals(expected, actual);
    }

    @Test
    public void printNumbersDivisibleBy99() {
        String actual = Main.printNumbersBetween1and100Test()[98];
        String expected = "#99";

        assertEquals(expected, actual);
    }

    @Test
    public void printInputStringScanner() {
        String parameter = "Hallo";
        String actual = Main.InputScanner(parameter)[0];

        String expected = "Hallo";
        assertEquals(expected, actual);
    }
}