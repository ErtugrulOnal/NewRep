package Practices.practice01;

public class Concatination {


    public static void main(String[] args) {

        //Initialize variable
        int age = 31;
        int weight = 85;

        //Print variables with label
        System.out.println("age = " + age);
        System.out.println("weight = " + weight);

        //Copy the variable's value
        int myAge =age;
        int ageCustomer=12;
        System.out.println("myAge = " + myAge);
        System.out.println("ageCustomer = " + ageCustomer);

        //Declare multiple variables in the same line
        int year=2022, month=12, day =30;
        System.out.println("day = " + day);
        System.out.println("month = " + month);
        System.out.println("year = " + year);

        //Update a variable
        year = 2023;

        System.out.println("year = " + year);

        //Declare a variable: x
        int x;

        //Initialize another variable : y

        int y =12;
        y=20;
        System.out.println("y = " + y);
        y=44;
        System.out.println("y = " + y);

        //intialize variable z

        int z=44;

        //intialize x by using z

        x=z;

        //update the variables

        y=31;
        System.out.println("y = " + y);


    }

}
