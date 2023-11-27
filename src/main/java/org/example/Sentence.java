package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sentence consisting of words and punctuation marks.
 */
public class Sentence {
    private final Object[] elements;
    /**
     * Constructs a Sentence object from a StringBuilder.
     *
     * @param sentence The StringBuilder representing the sentence.
     */
    public Sentence(StringBuilder sentence) {
        StringBuilder curWord = new StringBuilder();
        List<Object> elementsList = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                curWord.append(c);
            } else if (!Character.isSpaceChar(c)) {
                if (curWord.length() > 0) {
                    elementsList.add(new Word(curWord));
                    curWord = new StringBuilder();}
                elementsList.add(new PunctuationMark(c));
            } else {
                if (curWord.length() > 0) {
                elementsList.add(new Word(curWord));
                curWord = new StringBuilder();
            }

            }
        }
        if (curWord.length() > 0) {
            elementsList.add(new Word(curWord));
        }
        elements = elementsList.toArray();
    }
    /**
     * Gets an array of Word objects from the sentence.
     *
     * @return An array of Word objects.
     */
    public Word[] getWords() {
        List<Word> w = new ArrayList<>();
        for (Object element : elements) {
            if (element instanceof Word) {
                w.add((Word)element);
            }
        }
        return w.toArray(new Word[0]);
    }
    /**
     * Returns a string representation of the Sentence.
     *
     * @return A string representation of the sentence.
     */
    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        for (Object element : elements) {
            if(element instanceof PunctuationMark) {
                sentence.deleteCharAt(sentence.length() - 1);
            }
            sentence.append(element).append(" ");
        }
        return sentence.toString();
    }
}
