package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    @Test
    void changeTextTest1() {

        Main main = new Main();

        String text = "Привіт світ. Як справи? Все супер!";
        String wa = "світ Привіт. справи Як? супер Все!";

        String result = main.changeText(text);

        assertEquals(wa, result);
    }

    @Test
    void changeTextTest2() {

        Main main = new Main();

        String text = "Привіт світ.";
        String wa = "світ Привіт.";

        String result = main.changeText(text);

        assertEquals(wa, result);
    }

    @Test
    void changeTextTest3() {

        Main main = new Main();

        String text = "Супер!";
        String wa = "Супер!";

        String result = main.changeText(text);

        assertEquals(wa, result);
    }
}