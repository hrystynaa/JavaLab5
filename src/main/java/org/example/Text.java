package org.example;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private final Sentence[] sentences;

    public Text(StringBuilder text) {
        if (isWhiteSpaceOnly(text)) throw new IllegalArgumentException("Text is empty!");
        StringBuilder curSentence = new StringBuilder();
        List<Sentence> sentencesList = new ArrayList<>();
        boolean sentence = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            curSentence.append(c);
            if ("?.!".indexOf(c) != -1) {
                sentence = true;
            }
            if (sentence){
                sentencesList.add(new Sentence(curSentence));
                curSentence = new StringBuilder();
                sentence = false;
            }
        }
        if (curSentence.length() > 0) {
            sentencesList.add(new Sentence(curSentence));
        }
        sentences = new Sentence[sentencesList.size()];
        int i = 0;
        for (Sentence s : sentencesList) {
            sentences[i++] = s;
        }
    }

    public Sentence[] getSentences() {
        return this.sentences;
    }
    private boolean isWhiteSpaceOnly(StringBuilder text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isWhitespace(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Sentence s : sentences) {
            text.append(s.toString());
        }
        return text.toString();
    }
}
