package exercises.datatypes;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        Scanner input;
        double miles;
        double gallons;
        double mpg;

        input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        miles = input.nextDouble();
        input = new Scanner(System.in);
        System.out.println("Enter gallons used: ");
        gallons = input.nextDouble();
        input.close();

        mpg = miles / gallons;
        System.out.println("Your mpg is " + mpg + ".");


    }
}
