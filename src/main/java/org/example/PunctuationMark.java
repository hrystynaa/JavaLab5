package org.example;

public class PunctuationMark {
    private final char value;

    public PunctuationMark(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
