package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double area;
        double PI = 3.14;
        double r;

        input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = input.nextDouble();
        input.close();

        area = Circle.getArea(r);
        System.out.println("The area of a circle with the radius " + r + " is: " + area + ".");
    }
}
