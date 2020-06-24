package com.adobe.marketing.mobile.training;

public abstract class CalculateBase {

    private double leftVal;
    private double rightVal;
    private double result;

    // Accessors and Mutators

    public double getResult() {
        return result;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public CalculateBase() {}

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();


}
