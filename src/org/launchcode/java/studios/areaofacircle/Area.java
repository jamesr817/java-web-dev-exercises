package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import java.lang.Math.*;

public class Area {
    public static void main(String[] args) {
        double radius;
        double pi = Math.PI;
        double area;
        Scanner input;


        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();
//        area = pi * radius * radius;

        System.out.println(Circle.getArea(radius));
    }
}
