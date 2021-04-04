package com.pazzo;

import java.util.*;

public class Sphere {

    private double radius;
    private double pi=3.14;


    public Sphere(double radius) {

        this.radius=radius;
    }


    public double diameter(){

        return 2*radius;
    }

    public double circumference(){

        return 2*pi*radius;
    }


    public double surfaceArea(){

        return 4*pi*(radius*radius);
    }


    public double volume(){

        return (4/3f)*pi*(radius*radius*radius);
    }

}
