package exercises.datatypes;

import java.util.Scanner;
//import java.lang.String;

public class Alice {
    public static void main(String[] args){
        Scanner input;
        String found = "Phrase exists.";
        String notFound = "Phrase not found.";
        String phrase;
        String newSentence;
        String sentence = "Alice was beginning to get very tired" +
                " of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice" +
                " she had peeped into the book her sister was" +
                " reading, but it had no pictures or conversations in it," +
                " \'and what is the use of a book,\' thought Alice" +
                " \'without pictures or conversation?";

        input = new Scanner(System.in);
        System.out.println("Enter phrase to search: ");
        phrase = input.nextLine().toLowerCase();
        input.close();
        sentence = sentence.toLowerCase();

            if (sentence.contains(phrase)){
                System.out.print(sentence.indexOf(phrase));
                System.out.println("\n" + found);
                System.out.println(phrase.length());
                newSentence = sentence.replace(phrase + " ", "");
                System.out.println(newSentence);
            } else {
                System.out.println(notFound);
            }
    }
}
