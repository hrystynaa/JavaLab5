package org.example;

/**
 * Represents a word consisting of letters.
 */
public class Word {
    private final Letter[] letters;
    /**
     * Constructs a Word object from a StringBuilder.
     *
     * @param word The StringBuilder representing the word.
     */
    public Word(StringBuilder word) {
        Letter[] letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
        this.letters = letters;
    }
    /**
     * Gets an array of Letter objects from the word.
     *
     * @return An array of Letter objects.
     */
    public Letter[] getLetters() {
        return letters;
    }
    /**
     * Returns a string representation of the Word.
     *
     * @return A string representation of the word.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Letter letter : letters) {
            stringBuilder.append(letter.getValue());
        }
        return stringBuilder.toString();
    }
}
