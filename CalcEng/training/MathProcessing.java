package com.adobe.marketing.mobile.training;

public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword();  // example : add
    char getSymbol(); // example : +
    double doCalculation(double leftVal, double rightVal);


}
