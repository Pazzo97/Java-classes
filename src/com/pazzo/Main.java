package com.pazzo;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        Person patrick = new Person("Patrick","MUKUNZI",new GregorianCalendar(1997,1,25));


        System.out.println();

        System.out.println(
                "Hello I'm "+patrick.fullName() +
                        ". and Iam "+
                        patrick.age(new GregorianCalendar()) +
                        " Years old!");

    }
}
