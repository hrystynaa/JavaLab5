package org.example;
/**
 * Represents a single letter in a word.
 */
public class Letter {
    private final char value;
    /**
     * Constructs a Letter object with the specified character.
     *
     * @param character The character value of the letter.
     */
    public Letter(char character) {
        this.value = character;
    }
    /**
     * Gets the character value of the letter.
     *
     * @return The character value.
     */
    public char getValue() {
        return value;
    }
    /**
     * Returns a string representation of the Letter.
     *
     * @return A string representation of the letter.
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
