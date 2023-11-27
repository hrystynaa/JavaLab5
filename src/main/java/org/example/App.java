package org.example;

/**
 * The main application class that demonstrates text processing and sorting.
 */
public class App 
{
    /**
     * The main method that processes and sorts a sample text.
     *
     * @param args The command line arguments (unused in this case).
     */
    public static void main( String[] args )
    {
        StringBuilder inputText = new StringBuilder("Familiarization  with strings and use of basic methods of processing them in the Java programming language." +
                " Acquiring skills in using strings in the Java programming language.");
        try {
            // Create a Text object from the input text
            Text text = new Text(inputText);
            // Create a WordSorter object to sort words by vowels
            WordSorter sorter = new WordSorter();
            // Sort the words by vowels and get the result as a StringBuilder
            StringBuilder sortedText = sorter.sortWordsByVowels(text);
            // Print the input and sorted texts
            System.out.println("Input text: " + text);
            System.out.println("Sorted text: " + sortedText.toString());
        } catch (Exception e) {
            // Handle exceptions with a more meaningful message or log
            e.printStackTrace();
        }
    }
}
