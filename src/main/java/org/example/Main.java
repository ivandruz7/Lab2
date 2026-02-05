package org.example;

public class Main {

    public static void main(String[] args) {

        //Номер моєї залікової книжки 5206, С3 = 1 (тип змінних String)
        //С7 = 4 (В кожному речені заданого тексту змфнити місцями перше та
        // останнє слово, не змінивши довжину речкння.)

        String text = "Привіт світ. Як справи? Все супер!";

        String[] words = text.split("\\.");

        for (int i = 0; i < words.length; i++){
            String words1 = words[i];
            if (words1.charAt(words1.length() - 1) != 63 && words1.charAt(words1.length() - 1) != 33){
                String[] words2 = words1.split(" ");
                String words3 = words2[0];
                words2[0] = words2[words2.length - 1];
                words2[words2.length - 1] = words3 + ".";
                words[i] = String.join(" ", words2);

            }

        }

        words = text.split("\\?");
        for (int i = 0; i < words.length; i++){
            String words1 = words[i];
            if (words1.charAt(words1.length() - 1) != 63 && words1.charAt(words1.length() - 1) != 33){
                String[] words2 = words1.split(" ");
                String words3 = words2[0];
                words2[0] = words2[words2.length - 1];
                words2[words2.length - 1] = words3 + ".";
                words[i] = String.join(" ", words2);

            }

        }
//        String words1 = words[0];
//        for (int i = 0; i < words.length; i++){
//
//
//
//            if (words1.charAt(words1.length() - 1) == 46){
//
//                String s = words[i];
//                words
//                words1 = words[i + 1];
//
//            }
//
//        }
//
        for (int i = 0; i < words.length; i++){

            System.out.print(words[i]);
        }



    }

//    public String[] chenger(String text){
//
//        String[] words1 = text.split(".");
//        String[] words2 = words1.split("?");
//        String[] words3 = words2.split("!");
//
//        return words;
//    }
}