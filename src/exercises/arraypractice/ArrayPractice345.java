package exercises.arraypractice;

import java.util.Arrays;

public class ArrayPractice345 {
  public static void main(String[] args) {
    String passage = "I would not, could not, in a box. " +
        "I would not, could not with a fox. " +
        "I will not eat them in a house. " +
        "I will not eat them with a mouse.";

    System.out.println(Arrays.toString(passage.split(" ")));
    System.out.println(Arrays.toString(passage.split("\\.")));
  }
}
