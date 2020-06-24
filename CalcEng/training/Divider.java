package com.adobe.marketing.mobile.training;

public class Divider extends CalculateBase implements MathProcessing {
    public Divider(){}

    public Divider(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {
        double  value;
        if(getRightVal() != 0)
              value = getLeftVal() / getRightVal();
        else  value = 0.0;
        setResult(value);
    }

    // Methods of MathProcessing Interface that are to be implemented

    @Override
    public String getKeyword() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
