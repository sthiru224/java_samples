package com.adobe.marketing.mobile.training;

public class Adder extends CalculateBase implements MathProcessing {
    public Adder(){}

    public Adder(double leftVal, double rightVal){
            super(leftVal,rightVal);
    }

    @Override
    public void calculate() {

        double  value = getLeftVal() + getRightVal();
        setResult(value);
    }

    // Methods of the interface MathProcessing to be implemented

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
