package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordSorter {
    public StringBuilder sortWordsByVowels(Text text) throws IllegalArgumentException {
        if (text == null || text.getSentences().length == 0) {
            throw new IllegalArgumentException("Error: Input text cannot be empty");
        }

        ArrayList<Word> words = new ArrayList<>();
        Sentence[] sentences = text.getSentences();

        for (Sentence s : sentences) {
            Word[] w = s.getWords();
            Collections.addAll(words, w);
        }

        words.sort(Comparator.comparing(Object::toString));
        words.sort(Comparator.comparingInt(WordSorter::countVowels));

        StringBuilder sortedText = new StringBuilder();
        for (Word word : words) {
            sortedText.append(word).append(" ");
        }
        return sortedText;
    }
    public static int countVowels(Word word) {
        final StringBuilder vowels = new StringBuilder("aeiouAEIOU");
        int count = 0;
        for (Letter letter : word.getLetters()) {
            if (vowels.indexOf(String.valueOf(letter.getValue())) != -1) {
                count++;
            }
        }
        return count;
    }
}
