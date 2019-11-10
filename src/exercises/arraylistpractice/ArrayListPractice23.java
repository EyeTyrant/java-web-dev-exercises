package exercises.arraylistpractice;

    import java.util.ArrayList;
    import java.util.Arrays;

public class ArrayListPractice23 {
  public static void main(String[] args){
    ArrayList<String> myWords = new ArrayList<>(Arrays.asList("cheese", "bacon", "apple", "burrito", "nut", "corn", "potato", "bread", "ham", "banana", "crab", "lobster", "chicken", "fig", "lettuce", "pizza", "taco", "salad"));
    Words5.getFive(myWords, 7);
  }
}
