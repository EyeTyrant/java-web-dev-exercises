package exercises.arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
  public static void main(String[] args) {
    ArrayList<Integer> myNums = new ArrayList<>(Arrays.asList(3, 5, 35, 8, 9, 22, 14, 9, 3, 2, 2, 1, 7));
    System.out.println(SumNums.sumNums(myNums));
  }
}
