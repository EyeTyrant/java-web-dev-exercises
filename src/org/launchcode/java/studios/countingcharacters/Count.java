package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class Count {
  public static void main(String[] args) {
    String quote = "If the product of two terms is zero then common sense" +
        "says at least one of the two terms has to be zero to start with." +
        " So if you move all the terms over to one side, you can put the " +
        "quadratics into a form that can be factored allowing that side of " +
        "the equation to equal zero. Once you've done that, it's pretty " +
        "straightforward from there.";
    HashMap<Character, Integer> letters = new HashMap<>();
    char[] charsInQuote = quote.toCharArray();

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