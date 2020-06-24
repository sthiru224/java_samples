package com.adobe.marketing.mobile.training;

public class Power extends CalculateBase implements MathProcessing{
    public Power(){}

    public Power(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {

        double  value = Math.pow( getLeftVal(), getRightVal());
        setResult(value);
    }

    // Methods of the interface MathProcessing that are to be implemented
    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
