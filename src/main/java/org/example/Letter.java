package org.example;

public class Letter {
    private final char value;

    public Letter(char character) {
        this.value = character;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
