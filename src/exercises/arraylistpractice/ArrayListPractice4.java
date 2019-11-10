package exercises.arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice4 {
  public static void main(String[] args){
    String passage = "I would not, could not, in a box. " +
        "I would not, could not with a fox. " +
        "I will not eat them in a house. " +
        "I will not eat them with a mouse.";
    passage = passage.replaceAll("\\p{Punct}","");
    ArrayList<String> myWords = new ArrayList<>(Arrays.asList(passage.split(" ")));
    Words5.getFive(myWords, 3);
  }
}
