package org.example;

public class App 
{
    public static void main( String[] args )
    {
        StringBuilder inputText = new StringBuilder("Familiarization  with strings and use of basic methods of processing them in the Java programming language." +
                " Acquiring skills in using strings in the Java programming language.");
        try {
            Text text = new Text(inputText);
            WordSorter sorter = new WordSorter();
            StringBuilder sortedText = sorter.sortWordsByVowels(text);
            System.out.println("Input text: " + text);
            System.out.println("Sorted text: " + sortedText.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
