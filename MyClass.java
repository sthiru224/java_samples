package com.adobe.marketing.mobile.training;


public class MyClass {

    public void showSum(float x, float y, int count){
        float sum = x+y;
        for(int i=0;i<count;i++)
            System.out.println("From showSum " +  sum);
    }

    public void showSum1(float x, float y, int count){
        if(count < 1) return;
        float sum = x+y;
        for(int i=0;i<count;i++)
            System.out.println("From showSum1 " +  sum);
    }
}
