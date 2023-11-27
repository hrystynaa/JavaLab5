package org.example;
/**
 * Represents a punctuation mark.
 */
public class PunctuationMark {
    private final char value;
    /**
     * Constructs a PunctuationMark object with the specified character value.
     *
     * @param value The character value of the punctuation mark.
     */
    public PunctuationMark(char value) {
        this.value = value;
    }
    /**
     * Returns a string representation of the PunctuationMark.
     *
     * @return A string representation of the punctuation mark.
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
