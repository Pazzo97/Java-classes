package com.pazzo;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sphere sphere = new Sphere(6);

        System.out.println("Diameter of this Sphere is:\t" + sphere.diameter());
        System.out.println("Circumference of this Sphere is:\t" + sphere.circumference());
        System.out.println("Surface Area of this Sphere is:\t" + sphere.surfaceArea());
        System.out.println("Volume of this Sphere is:\t" + sphere.volume());

    }
}
