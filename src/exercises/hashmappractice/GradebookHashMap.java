package exercises.hashmappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {

  public static void main(String[] args) {

    HashMap<Integer, String> ids = new HashMap<>();
    Scanner input = new Scanner(System.in);
    int newId;

    System.out.println("Enter ID number (or ENTER 0 to finish):");

    do {

      System.out.print("ID: ");
      newId = input.nextInt();

      if (newId != 0) {
        System.out.print("Name: ");
        String newName = input.next();
        ids.put(newId, newName);

        input.nextLine();
      }

    } while(newId != 0);

    System.out.println("\nClass roster:");

    for (Map.Entry<Integer, String> id : ids.entrySet()) {
      System.out.println(id.getKey() + " (" + id.getValue() + ")");
    }
  }
}

