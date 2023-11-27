package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Utility class for sorting words by vowels in a text.
 */
public class WordSorter {
    /**
     * Sorts words in the given text by vowels and returns the result as a StringBuilder.
     *
     * @param text The input text containing sentences and words.
     * @return A StringBuilder containing the sorted words.
     * @throws IllegalArgumentException If the input text is null or empty.
     */
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
        // Sort words first by natural order, then by the count of vowels
        words.sort(Comparator.comparing(Object::toString));
        words.sort(Comparator.comparingInt(WordSorter::countVowels));

        // Build the sorted text
        StringBuilder sortedText = new StringBuilder();
        for (Word word : words) {
            sortedText.append(word).append(" ");
        }
        return sortedText;
    }
    /**
     * Counts the number of vowels in a word.
     *
     * @param word The word for which to count vowels.
     * @return The count of vowels in the word.
     */
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
