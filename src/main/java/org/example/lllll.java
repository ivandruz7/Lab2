package org.example;

public class lllll {

    public static void main(String[] args) {

        String text = "Привіт світ. Як справи? Все супер!";

        String[] words = text.split(" ");

        String textc = "";
        String newtext = "";
        String exstra2 = "";
        int k = 0, p = 0, o = 0;

        for (int i = 0; i < words.length; i++){

            textc += words[i] + " ";

            if (textc.charAt(textc.length() - 2) == 46){
                textc = textc.substring(0, textc.length() - 2);
                String[] exstra = textc.split(" ");
                exstra2 = exstra[exstra.length - 1];
                exstra[exstra.length - 1] = exstra[0];
                exstra[0] = exstra2;
                textc = String.join(" ", exstra);
                k = 1;
            }

            if (textc.charAt(textc.length() - 2) == 63){
                textc = textc.substring(0, textc.length() - 2);
                String[] exstra = textc.split(" ");
                exstra2 = exstra[exstra.length - 1];
                exstra[exstra.length - 1] = exstra[0];
                exstra[0] = exstra2;
                textc = String.join(" ", exstra);
                p = 1;
            }

            if (textc.charAt(textc.length() - 2) == 33){
                textc = textc.substring(0, textc.length() - 2);
                String[] exstra = textc.split(" ");
                exstra2 = exstra[exstra.length - 1];
                exstra[exstra.length - 1] = exstra[0];
                exstra[0] = exstra2;
                textc = String.join(" ", exstra);
                o = 1;
            }


            if (k == 1) {
                newtext += textc + ". ";
                k = 0;
                textc = "";
            }
            if (p == 1) {
                newtext += textc + "? ";
                p = 0;
                textc = "";
            }
            if (o == 1) {
                newtext += textc + "! ";
                o = 0;
                textc = "";
            }
        }
        System.out.println(newtext);
    }
}