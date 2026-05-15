package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversTest {

    @Test
    void testSwapFirstAndLastWords() {
        String input = "Привіт дорогий світ. Як справи? Все супер!";
        String expected = "світ дорогий Привіт. справи Як? супер Все!";

        Revers processor = new Revers(input);
        assertEquals(expected, processor.process());
    }

    @Test
    void testSingleWordSentence() {
        String input = "Привіт. Світ!";
        String expected = "Привіт. Світ!";

        Revers processor = new Revers(input);
        assertEquals(expected, processor.process());
    }

    @Test
    void testMultipleSpacesHandling() {
        String input = "Я    вивчаю   Java.";
        String expected = "Java вивчаю Я.";

        Revers processor = new Revers(input);
        assertEquals(expected, processor.process());
    }

    @Test
    void testLongSentence() {
        String input = "Програмування це дуже цікавий та складний процес.";
        String expected = "процес це дуже цікавий та складний Програмування.";

        Revers processor = new Revers(input);
        assertEquals(expected, processor.process());
    }

    @Test
    void testConstructorException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Revers(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Revers("");
        });
    }

    @Test
    void testDifferentPunctuation() {
        String input = "Хто там? Це я! Відчиняй.";
        String expected = "там Хто? я Це! Відчиняй.";

        Revers processor = new Revers(input);
        assertEquals(expected, processor.process());
    }
}