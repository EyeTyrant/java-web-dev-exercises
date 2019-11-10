package exercises.arraypractice;

public class ArrayPractice2 {
  public static void main(String[] args) {
    int[] myArray = {1, 1, 2, 3, 5, 8};

    for ( int i : myArray) {
//      System.out.println(i);
      if (i%2 == 1){
        System.out.println(i);
      }
    }
  }
}