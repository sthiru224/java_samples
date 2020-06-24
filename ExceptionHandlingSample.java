package com.adobe.marketing.mobile.training;

public class ExceptionHandlingSample {
    int i = 12;
    int j = 5;

    ExceptionHandlingSample() {

        try

        {
            for(int k=0;k<10;k++) {
                int result = i / (j - k);
                System.out.println(" Result =  " + result);
            }

        } catch(
        Exception e)

        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
