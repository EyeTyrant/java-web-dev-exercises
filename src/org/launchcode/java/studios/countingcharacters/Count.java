package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
  public static void main(String[] args) {
    String quote = "";
    HashMap<Character, Integer> letters = new HashMap<>();
    Scanner input = new Scanner(System.in);
    // Bonus mission 1: added prompt for user to enter string
    System.out.println("Enter a quote: ");
    quote = input.nextLine();
    // Bonus mission 3: excluded non-alphabetic characters
    quote = quote.replaceAll("\\s", "");
    quote = quote.replaceAll("\\p{Punct}","");
    // Bonus mission 2: added toLowerCase() to make case-insensitive
    char[] charsInQuote = quote.toLowerCase().toCharArray();
    for (char i : charsInQuote){
      if (letters.containsKey(i)) {
        letters.put(i, letters.get(i) + 1);
      } else {
        letters.put(i, 1);
      }
    }
    for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
      System.out.println(letter.getKey() + ": " + letter.getValue());
    }
  }
}
