package com.pazzo;

import java.util.*;

public class Person {

    private String firstName;
    private String lastName;
    private Calendar birthday;

    public  Person(String firstName,String lastName,Calendar birthday){

        this.firstName= firstName;
        this.lastName= lastName;
        this.birthday= birthday;

    }


    public String fullName(){

        return firstName+" "+lastName;
    }

    public int age(Calendar today){

        return today.get(Calendar.YEAR)- birthday.get(Calendar.YEAR);
    }

}
