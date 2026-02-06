package org.example;

public class Main {

    public static void main(String[] args) {

        //Номер моєї залікової книжки 5206. С3 = 1 (тип зміннх String)
        //С17 = 4 (в кожному речені заданого тексту змінити місцями перше
        // та останнє слово, не змінивши довжину речення.)

        Main main = new Main();

        String text = "Привіт світ. Як справи? Все супер!";

        System.out.println("Початковий текст: ");
        System.out.println(text);
        System.out.println(" ");
        System.out.println("Перетворений текс: ");
        System.out.println(main.changeText(text));

    }

    public String changeText(String text){

        String[] words = text.split(" ");

        String textc = "";
        String newtext = "";
        char lastchar = '!';
        int k = 0;

        for (int i = 0; i < words.length; i++){

            textc += words[i] + " ";

            if (textc.charAt(textc.length() - 2) == '.'){
                textc = revers(textc);
                lastchar = '.';
                k = 1;
            }
            else if (textc.charAt(textc.length() - 2) == '?'){
                textc = revers(textc);
                lastchar = '?';
                k = 1;
            }

            else if (textc.charAt(textc.length() - 2) == '!'){
                textc = revers(textc);
                lastchar = '!';
                k = 1;
            }


            if (k == 1) {
                newtext += textc + lastchar + " ";
                k = 0;
                textc = "";
            }

        }
        return newtext.trim();

    }

    public String revers(String textc){
        String exstra2;
        textc = textc.substring(0, textc.length() - 2);
        String[] exstra = textc.split(" ");
        exstra2 = exstra[exstra.length - 1];
        exstra[exstra.length - 1] = exstra[0];
        exstra[0] = exstra2;
        textc = String.join(" ", exstra);
        return textc;
    }

}