package org.example;

public class Word {
    private final Letter[] letters;
    public Letter[] getLetters() {
        return letters;
    }
    public Word(StringBuilder word) {
        Letter[] letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
        this.letters = letters;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Letter letter : letters) {
            stringBuilder.append(letter.getValue());
        }
        return stringBuilder.toString();
    }
}
