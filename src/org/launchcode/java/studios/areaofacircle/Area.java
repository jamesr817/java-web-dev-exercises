package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import java.lang.Math;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
    }

    public static Double getArea(Double radius) {
        Double pi = Math.PI;
        return pi * radius * radius;
    }
}
