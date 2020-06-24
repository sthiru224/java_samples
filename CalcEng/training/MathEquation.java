package com.adobe.marketing.mobile.training;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;


    // Setter / Accessor and Getter / Mutator Methods of private members

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public char getOpCode() {
        return opCode;
    }

    // No Setter / Accessor  method for the result variable
    public double getResult() {
        return result;
    }

    public MathEquation(){

    }

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(double leftVal, double rightVal,char opCode){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    public void execute(double leftVal, double rightVal){
        this.leftVal  = leftVal;
        this.rightVal = rightVal;
        execute();
    }

    public void execute(int leftVal, int rightVal){
        this.leftVal  = leftVal;
        this.rightVal = rightVal;
        execute();
        result = (int) result;
    }

    public void execute() {
        switch (opCode){
            case 'a':
                result = leftVal + rightVal ;
                break;
            case 's':
                result = leftVal - rightVal ;
                break;
            case 'm':
                result  = leftVal * rightVal ;
                break;
            case 'd':
                result  = rightVal==0.0d? 0.0d:leftVal/rightVal;
                break;
        }

    }

}
