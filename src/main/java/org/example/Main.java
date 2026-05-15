package org.example;

public class Main {

    public static void main(String[] args) {

        //Номер моєї залікової книжки 5206. С3 = 1 (тип зміннх String)
        //С17 = 4 (в кожному речені заданого тексту змінити місцями перше
        // та останнє слово, не змінивши довжину речення.)

        String text = "Привіт світ. Як справи? Все супер!";

        Revers textc = new Revers(text);

        System.out.println("Початковий текст: ");
        System.out.println(text);
        System.out.println(" ");
        System.out.println("Перетворений текс: ");
        System.out.println(textc.process());

    }

}