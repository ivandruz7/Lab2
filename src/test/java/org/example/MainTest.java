package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    @Test
    void changeText1() {

        Main main = new Main();

        String text = "Привіт світ. Як справи? Все супер!";
        String wa = "світ Привіт. справи Як? супер Все!";

        String result = main.changeText(text);

        assertEquals(result, wa);

    }
}