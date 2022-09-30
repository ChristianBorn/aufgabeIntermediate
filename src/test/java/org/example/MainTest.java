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
}