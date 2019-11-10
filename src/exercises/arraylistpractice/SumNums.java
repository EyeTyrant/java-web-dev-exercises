package exercises.arraylistpractice;

import java.util.ArrayList;

public class SumNums {
  public static Integer sumNums(ArrayList<Integer> arr){
    Integer num = 0;
    for (Integer i : arr) {
      num += i;
    }
    return num;
  }

}
