package com.adobe.marketing.mobile.training;

public class Passenger extends Person implements Comparable<Passenger> {
    private int memberLevel; // 3 (1st Priority,2,1
    private int memberDays;
    String name;
    int checkedBags;
    int allowedBags;

    Passenger(String name, int checkedBags,int allowedBags) {
        this.name = name;
        this.checkedBags = checkedBags;
        this.allowedBags = allowedBags;
    }

    public String getName(){
        return name;
    }

    public void setLevelAndDays(int memberLevel, int memberDays) {
        this.memberLevel = memberLevel;
        this.memberDays  = memberDays;

    }

    @Override
    public int compareTo(Passenger p){       // Implementing the compareTo method in the Interface Comparable.
        if(memberLevel > p.memberLevel)   // Current member has higher level than the one trying to compare.
            return -1;
        else if(memberLevel < p.memberLevel)
            return 1;                     // Current member has lower level than the one trying to compare.
        else {
            // Current member and one trying to compare are in the same level, so tie.
            // So, we can use the memberDays to chose to provide the priority
            if(memberDays > p.memberDays)
                return -1;
            else if (memberDays < p.memberDays)
                return 1;
            else
                return 0;
        }
    }



}
