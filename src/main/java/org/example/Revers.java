package org.example;

public class Revers {

    private String text;

    public Revers(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Текст не може бути порожнім");
        }
        this.text = text;
    }

    public String process() {
        String[] sentences = text.split("(?<=[.!?])\\s*");
        String result = "";

        for (int i = 0; i < sentences.length; i++) {
            result += swapWords(sentences[i]);
            if (i < sentences.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    private String swapWords(String sentence) {
        if (sentence.length() <= 1) return sentence;

        char punctuation = sentence.charAt(sentence.length() - 1);
        String content = sentence.substring(0, sentence.length() - 1);

        String[] words = content.trim().split("\\s+");

        if (words.length > 1) {
            String firstWord = words[0];
            words[0] = words[words.length - 1];
            words[words.length - 1] = firstWord;

            String swappedContent = "";
            for (int i = 0; i < words.length; i++) {
                swappedContent += words[i];
                if (i < words.length - 1) {
                    swappedContent += " ";
                }
            }
            return swappedContent + punctuation;
        }

        return sentence;
    }
}