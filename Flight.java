package com.adobe.marketing.mobile.training;


import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Person> {

    static int allPassengers;

    static int getAllPassengers(){
        return allPassengers;
    }

    static int resetAllPassengers(){
         allPassengers=0;
         return allPassengers;
    }

    public String flightId;
    public int passengers;     // Note the modifier - it is not public - that means this is accessible within the classes of this package as like a public variable
                                // and not accessible from other packages
                                // If it becomes a "public int passengers", this this variable will be accessible from everywhere.
    private int seats;          // accessible only in this class
    private int totalCheckedBags;
    private int flightTime;
    private CrewMember[] crew;
    private Passenger[]  roster;

    // Constructor
    Flight(String flightId){
        this.flightId = flightId;
        seats = 1;
        passengers = 0;
        totalCheckedBags = 0;
    }

    // Accessor
    public String getFlightId() {
        return this.flightId;
    }

    public int getSeats() {

        return this.seats;
    }

    public int getFlightTime() {

        return this.flightTime;
    }

    public int getTotalCheckedBags(){

        return this.totalCheckedBags;
    }

    //Mutator
    public void setSeats(int seats){

        this.seats = seats;
    }

    public void setFlightTime(int flightTime){
        this.flightTime = flightTime;
    }

    public void addTotalCheckedBags(int count){
        this.totalCheckedBags += count;

    }

    public void reduceTotalCheckedBags(int count){
        this.totalCheckedBags -= count;

    }

    public void addPassenger(){
        if(passengers < seats) {
            passengers += 1;
            allPassengers += 1;
        }
        else
            handleTooMany();
    }

    private void handleTooMany() {
        System.out.println("Flight is Full");
    }

    public boolean hasRoom(){
         return (passengers < seats);
    }

    public boolean hasRoom(int count){
        return (passengers+count <= seats);
    }

    public void addPassengers(Passenger... list){
            // Note the array notation [] has been replaced with ellipsis ...
            //
        if(hasRoom(list.length)){
            passengers = passengers + list.length;
            this.allPassengers +=  list.length;
            for(Passenger passenger: list) {
                this.addTotalCheckedBags(passenger.checkedBags);
            }
        } else {
            handleTooMany();
        }
    }




    @Override
    public int compareTo(Flight f) {
        return this.flightTime - f.flightTime;
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}

