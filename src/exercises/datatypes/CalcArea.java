package exercises.datatypes;

import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = input.nextDouble();
//        input.close();

        input = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = input.nextDouble();
        input.close();

        area = length * width;
        System.out.println("The area of your rectangle is " + area + ".");
    }

}
