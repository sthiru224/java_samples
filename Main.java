package com.adobe.marketing.mobile.training;

import java.util.Arrays;
import static com.adobe.marketing.mobile.training.Flight.*;

public class Main {

    public static void main(String[] args) {


    // 1 Primitive Data Types in Java

        int     intVal = 100;
        byte    byteVal = 7;
        short   shortVal = 100;
        long    longVal = 100;
        float   floatVal = 1.0f;
        double  doubleVal = 4.0d;

        short  result1  = (short) byteVal;
        short  result2  = (short) (byteVal - longVal);
        double result3 = longVal - doubleVal;
        long   result4 = (long) (shortVal - longVal + floatVal);

        System.out.println("Success learning Primitive Data Types");
        System.out.println("-----------------------------------------------------------");

     // 2 Conditional Assignment  in Java

        int xMax = (10>20) ? 10:20;

        System.out.println("Max =  " + xMax);

        // Conditional Assignment  in Java

        float rooms = 4;
        float students = 30;
        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;

        System.out.println("Students Per Room =  " + studentsPerRoom);
        System.out.println("-----------------------------------------------------------");

    // 3 If-Else Statement   in Java

        int v1 = 10;
        int v2 = 20;
        if(v1 > v2)
            System.out.println("V1 is big");
        else if(v1 < v2)
            System.out.println("V2 is Big");
        else
            System.out.println("V1 and V2 are equal");
        System.out.println("-----------------------------------------------------------");

     // 4 Block  Statements   in Java

        int diff;

        if(v1 > v2) {
            diff = v1-v2;
            System.out.println("V1 is big and Diff is " + diff);
        }
        else if(v1 < v2) {
            diff = v2-v1;
            System.out.println("V2 is Big and Diff is " + diff);
        }
        else
            System.out.println("V1 and V2 are equal");
        System.out.println("-----------------------------------------------------------");

    // 5 Nested If in Java

        rooms = 0.0f;
        students = 4.0f;

        if(students > 0.0f)
            if (rooms > 0.0f)
                System.out.println("Students Per Room =  " + students / rooms);
        else
                System.out.println("No Students");

        // Tutorial 5.4  mentioned it wrong --- Need to check ???

        if(students > 0.0f) {
            if (rooms > 0.0f)
                System.out.println("Students Per Room =  " + students / rooms);
        }
        else
            System.out.println("No Students");
        System.out.println("-----------------------------------------------------------");

    // 6 Block Statements and Variable Scope

        float students1 = 30.0f;
        float rooms1 = 4.0f;
        if(rooms1 > 0.0f) {
            System.out.println("Students : " + students1);
            System.out.println("rooms : " + rooms1);
            float avg = students1/rooms1;
            System.out.println("avg : " + avg);
            // The variable "avg" is available only within this block
            // whereas the other twp variables students1 and rooms1 are available out side of this block too.
        }
        System.out.println("-----------------------------------------------------------");

    // 7 Logical & and Conditional Logical & (&&)   -- They behave same now... Need to check ???

        float students2 = 30.0f;
        float rooms2 = 0.0f;

        if(rooms2 > 0 & students2/rooms2 > 30)
            System.out.println("The rooms are crowded...");
        else
            System.out.println("No rooms are available");
        System.out.println("-----------------------------------------------------------");

    // 8a Loops in Java - While Loop  - The conditional Expression is validated at the beginning of the loop

        int kVal = 5;
        int factorial = 1;
        while (kVal > 1) {
            factorial *= kVal;
            kVal--;
        }
        System.out.println("8a1. Factorial =  " + factorial);

        kVal = 5;
        factorial = 1;
        while (kVal > 1) {
            factorial *= kVal--;
        }
        System.out.println("8a2. Factorial =  " + factorial);
        System.out.println("-----------------------------------------------------------");

    // 8b Loops in Java - Do-While Loop - The conditional Expression is validated at the end of the 1st iteration of the loop
    // So, the block of statements enclosed by the Do-While loop will be executed at least once

        kVal = 5;
        factorial = 1;
        do {
            factorial *= kVal--;
        } while (kVal > 1);
        System.out.println("8b.  Factorial =  " + factorial);
        System.out.println("-----------------------------------------------------------");


    // 8c Loops in Java - For  Loop

        kVal = 5;
        factorial = 1;
        for(; kVal>1; kVal--) {
            factorial *= kVal;
        }
        System.out.println("8c.  Factorial =  " + factorial);

        for(int i=1; i<10; i++) {
            System.out.print(" i = " + i + " : ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------");


     //  9a Arrays in Java

        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;
        float sum = 0.0f;
        for(int i=0;i<theVals.length;i++)
            sum += theVals[i];
        System.out.println("9a.  Sum  = " + sum);


        float[] theVals1  = {30.0f, 40.0f, 50.0f};
        sum = 0.0f;
        for(int i=0;i<theVals1.length;i++)
            sum += theVals1[i];
        System.out.println("9b.  Sum  = " + sum);
        System.out.println("-----------------------------------------------------------");

    // 9b Arrays in Java and For-Loop
        sum = 0.0f;
        for(float x:theVals1)
            sum += x;
        System.out.println("9c.  Sum  = " + sum);
        System.out.println("-----------------------------------------------------------");

    // 10. Switch Statement in Java
        int iVal = 9;
        switch (iVal % 2){
            case 0:
                    System.out.println("10. Given number " + iVal + " is an Even Number");
                    break;
            case 1:
                System.out.println("10. Given number " + iVal + " is an Odd Number");
                break;
            default:
                System.out.println("10. Oops! It is broken");  // Entering a negative value will show this message
        }
        System.out.println("-----------------------------------------------------------");

    // 11. Using Classes

        Flight nycToSF = new Flight("PL01");
        Flight slcToDallas = new Flight("PL02");
        slcToDallas.addPassenger();
        System.out.println("11. Number of Passengers in the flight slcToDallas : " + slcToDallas.passengers);
        System.out.println("-----------------------------------------------------------");

    // 12. Classes are Reference Types


        Flight flight1 = new Flight("LO01");
        Flight flight2 = new Flight("LO02");
        flight2.addPassenger();
        System.out.println("12. Number of Passengers in the flight flight2 : " + flight2.passengers);
        flight2=flight1;
        System.out.println("12. Number of Passengers in the flight flight2 : " + flight2.passengers);
        flight1.addPassenger();
        System.out.println("12. Number of Passengers in the flight flight2 : " + flight2.passengers);
        flight1.addPassenger();
        System.out.println("12. umber of Passengers in the flight flight2 : " + flight2.passengers);
        System.out.println("-----------------------------------------------------------");


    // 13. Method Basics
        MyClass m = new MyClass();
        m.showSum(10,20,2);
        System.out.println("-----------------------------------------------------------");

    // 14. Method with return to exit
        MyClass m1 = new MyClass();
        m1.showSum1(10,20,0);
        m1.showSum1(10,20,1);
        System.out.println("-----------------------------------------------------------");

    // 15. Method with return values
        Flight flight3 = new Flight("LO01");
        flight3.addPassenger();
        if(flight3.hasRoom())  flight3.addPassenger();
        if(flight3.hasRoom())  flight3.addPassenger();
        if(flight3.hasRoom())  flight3.addPassenger();
        System.out.println("-----------------------------------------------------------");

    // 16. Accessor and Mutator Methods / Getters and Setters
        Flight flight4 = new Flight("PO011");
        flight4.setSeats(3);
        System.out.println("Capacity of  this flight : " + flight4.getSeats());
        System.out.println("Number of Passengers booked this flight : " + flight4.passengers);
        flight4.addPassenger();
        System.out.println("Capacity of  this flight : " + flight4.getSeats());
        System.out.println("Number of Passengers booked this flight : " + flight4.passengers);
        flight4.addPassenger();
        System.out.println("Capacity of  this flight : " + flight4.getSeats());
        System.out.println("Number of Passengers booked this flight : " + flight4.passengers);
        flight4.addPassenger();
        System.out.println("Capacity of  this flight : " + flight4.getSeats());
        System.out.println("Number of Passengers booked this flight : " + flight4.passengers);
        flight4.addPassenger();
        System.out.println("Capacity of  this flight : " + flight4.getSeats());
        System.out.println("Number of Passengers booked this flight : " + flight4.passengers);
        System.out.println("-----------------------------------------------------------");

    // 17. Mechanisms to establish Initial State of an Object : Constructor, Field Initializer, Initialization blocks
    //     byte, short, int, long   --> will be initialized as 0 by default
    //     float, double            --> will be initialized as 0.0 by default
    //     char                     --> will be initialized as '\u0000' (null) by default
    //     boolean                  --> will be initialized as false by default
    //     reference type           --> will be initialized as null by default


    // 18. Ellipsis instead of array notation []

        Flight f = new Flight("PSS01");
        f.setSeats(10);
        Passenger jane = new Passenger("Jane",0,1);
        Passenger mike = new Passenger("Mike",0,2);
        f.addPassengers(new Passenger[] {jane, mike});
        System.out.println("Total No. of seats : " + f.getSeats() + " No. of passengers : " + f.passengers);
        Passenger fred = new Passenger("Fred",0,1);
        Passenger john = new Passenger("John", 0,2);
        Passenger pete = new Passenger("Pete",0,3);
        // with [] notation as the object type notation
        f.addPassengers(new Passenger[] {fred,pete,john});
        System.out.println("Total No. of seats : " + f.getSeats() + " No. of passengers : " + f.passengers);
        System.out.println("-----------------------------------------------------------");
        Passenger fred1 = new Passenger("Fred1",0,1);
        Passenger john1 = new Passenger("John1",0,2);
        Passenger pete1 = new Passenger("Pete1",0,3);
        // with ellipse notation as the object type notation
        f.addPassengers(fred1,pete1,john1);
        System.out.println("Total No. of seats : " + f.getSeats() + " No. of passengers : " + f.passengers);
        Passenger fred11 = new Passenger("Fred11",0,1);
        Passenger john11 = new Passenger("John11",0,2);
        Passenger pete11 = new Passenger("Pete11",0,3);
        // with ellipse notation as the object type notation
        f.addPassengers(fred11,pete11);
        System.out.println("Total No. of seats : " + f.getSeats() + " No. of passengers : " + f.passengers);
        f.addPassengers(john11);
        // Part of Static Variable example
        System.out.println("All Passengers : " + getAllPassengers());
        resetAllPassengers();
        System.out.println("All Passengers : " + getAllPassengers());

        System.out.println("-----------------------------------------------------------");

    // 19a Sorting - Bubble Sort

        int[] inNumArray1 = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        System.out.print(" Given List : ");
        BubbleSort.printNumArray(inNumArray1);
        BubbleSort.doBubbleSort(inNumArray1);
        System.out.print(" Sorted List : ");
        BubbleSort.printNumArray(inNumArray1);
        System.out.println("-----------------------------------------------------------");

    // 19b Sorting - InsertionSort

        int[] inNumArray2 = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        int[] originalNumArray2 = Arrays.copyOf(inNumArray2, inNumArray2.length);
        inNumArray2 = Arrays.copyOf(originalNumArray2, originalNumArray2.length);
        System.out.print(" Given List : ");
        InsertionSort.printNumArray(inNumArray2);
        InsertionSort.doInsertionSort(inNumArray2);
        System.out.print(" Sorted List : ");
        InsertionSort.printNumArray(inNumArray2);
        System.out.println("-----------------------------------------------------------");

    // 19b Sorting - MergeSort

        System.out.println("Merge Sort : ");
        int[] inputArr3 = {45,23,11,89,77,98,4,28,65,43};
        System.out.print(" Given List : ");
        MergeSort.printNumArray(inputArr3);
        MergeSort mms =  new MergeSort();
        mms.sort(inputArr3);
        System.out.print(" Sorted List : ");
        MergeSort.printNumArray(inputArr3);
        System.out.println("-----------------------------------------------------------");

    // 20a. Exception Handling - 1  / Divide by Zero

        ExceptionHandlingSample sample = new ExceptionHandlingSample();
        System.out.println("-----------------------------------------------------------");


    // 20b. Exception  Handling - 4

        ReadFromAFile rf = new ReadFromAFile();
        System.out.println("-----------------------------------------------------------");

    // 20c. Exception  Handling - 3  Login  / Keyboard input validation
//        try{
//            Login l1 = new Login();
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        System.out.println("-----------------------------------------------------------");
        // Part of Static Variable example
        System.out.println("All Passengers : " + getAllPassengers());
        resetAllPassengers();
        System.out.println("All Passengers : " + getAllPassengers());


     // 21a. Interface - Example  1
        Passenger bob = new Passenger("Bob", 0,2);
        bob.setLevelAndDays(1,180);

        Passenger kevin = new Passenger("Kevin", 0,2);
        kevin.setLevelAndDays(1,90);

        Passenger steven = new Passenger("Steven", 0,2);
        steven.setLevelAndDays(2,180);

        Passenger liza = new Passenger("Liza", 0,2);
        liza.setLevelAndDays(3,730);

        Passenger[] passengers = {bob, kevin, steven,liza};
        Arrays.sort(passengers);

        for(Passenger pas:passengers)
            System.out.println(pas.getName());
        System.out.println("-----------------------------------------------------------");

    // Part of Static Variable example
        System.out.println("All Passengers : " + getAllPassengers());
        resetAllPassengers();
        System.out.println("All Passengers : " + getAllPassengers());


        // 21b. Interface - Example  2

        Flight f1 = new Flight("SG1");
        f1.setFlightTime(45);
        Flight f2 = new Flight("KQ1");
        f2.setFlightTime(15);
        Flight f3 = new Flight("AN1");
        f3.setFlightTime(65);
        Flight f4 = new Flight("QA1");
        f4.setFlightTime(5);
        Flight[] flights = {f1,f2,f3,f4};
        Arrays.sort(flights);
        for(Flight fl:flights)
            System.out.println(fl.getFlightTime() + " : " + fl.getFlightId());
        System.out.println("-----------------------------------------------------------");

    // 22. Static Variable example
        System.out.println("All Passengers : " + getAllPassengers());

        // End of this program
        System.out.println("******* End of Program *******");

    }
}
