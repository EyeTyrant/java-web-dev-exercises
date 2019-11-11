package org.launchcode.java.studios.countingcharacters;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CountSuperBonus {
  public static void main(String[] args) throws IOException {
//     Super Bonus mission: read string from a file
    String quote = new String(Files.readAllBytes(Paths.get("C:\\Users\\jg141.000\\Desktop\\LaunchCode\\Java\\JavaPractice\\Chapter01\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\countingcharacters\\testfile")));
    HashMap<Character, Integer> letters = new HashMap<>();

//     Bonus mission 3: excluded non-alphabetic characters
    quote = quote.replaceAll("\\s", "");
    quote = quote.replaceAll("\\p{Punct}","");
//     Bonus mission 2: added toLowerCase() to make case-insensitive
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