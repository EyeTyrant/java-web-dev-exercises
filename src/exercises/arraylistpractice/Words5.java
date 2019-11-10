package exercises.arraylistpractice;

import java.util.ArrayList;

public class Words5 {
  public static String getFive(ArrayList<String> arr, Integer length){
    for (String i : arr){
      if (i.length() == length){
        System.out.println(i);}
    }
    return null;
  }


}
