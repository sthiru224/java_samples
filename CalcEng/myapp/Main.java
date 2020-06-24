package com.adobe.marketing.mobile.myapp;

import com.adobe.marketing.mobile.training.Adder;
import com.adobe.marketing.mobile.training.CalculateBase;
import com.adobe.marketing.mobile.training.CalculateHelper;
import com.adobe.marketing.mobile.training.Divider;
import com.adobe.marketing.mobile.training.DynamicHelper;
import com.adobe.marketing.mobile.training.InvalidStatementException;
import com.adobe.marketing.mobile.training.MathEquation;
import com.adobe.marketing.mobile.training.MathProcessing;
import com.adobe.marketing.mobile.training.Multiplier;
import com.adobe.marketing.mobile.training.Power;
import com.adobe.marketing.mobile.training.Subtracter;

public class Main {

    public static void main(String[] args) {

        // Using Interface

        System.out.println("Using Interface");

        String[] statements1 = {
                "add 25.0 92.0",         // 25.0  + 92.0 = 117.0
                "subtract 225.0 17.0",    // 225.0 - 17.0 = 208.0
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0",
                "power 5.0 2.0"
        };

        DynamicHelper helper1 = new DynamicHelper(new MathProcessing[] { new Adder(), new Subtracter(), new Divider(), new Multiplier(), new Power()});

        for(String statement:statements1){
            String output = helper1.process(statement);
            System.out.println(output);

        }

        System.out.println("-------------------------------");
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');
        for (MathEquation mathequation : equations) {
            mathequation.execute();
            System.out.println(mathequation.getLeftVal() + " " + mathequation.getOpCode() + " " + mathequation.getRightVal() + " = " + mathequation.getResult());
        }
        System.out.println("-------------------------------");

        MathEquation[] equations1 = new MathEquation[4];
        equations1[0] = new MathEquation(100.00d, 50.0d, 'd');
        equations1[1] = new MathEquation(100.00d, 50.0d, 'a');
        equations1[2] = new MathEquation(100.00d, 50.0d, 's');
        equations1[3] = new MathEquation(100.00d, 50.0d, 'm');
        for (MathEquation mathequation1 : equations1) {
            mathequation1.execute();
            System.out.println(mathequation1.getLeftVal() + " " + mathequation1.getOpCode() + " " + mathequation1.getRightVal() + " = " + mathequation1.getResult());
        }
        System.out.println("-------------------------------");


        System.out.println("For more details refer : http://bit.ly/javamethodselection");
        System.out.println("Example for Method Overloading - 1 ");
        double leftDbl = 9.0d;
        double rightDbl = 2.0d;
        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDbl, rightDbl);
        System.out.println(leftDbl + " " + "d" + " " + rightDbl + " = " + equationOverload.getResult());
        System.out.println("-------------------------------");


        System.out.println("Example for Method Overloading  - 2 ");
        int leftInt = 9;
        int rightInt = 2;
        MathEquation equationOverload1 = new MathEquation('d');
        equationOverload1.execute(leftInt, rightInt);
        System.out.println(leftInt + " " + "d" + " " + rightInt + " = " + equationOverload1.getResult());
        System.out.println("-------------------------------");

        System.out.println("Example for Method Overloading  - 3 ");
        int leftInt1 = 9;
        double rightDbl1 = 2.0d;
        MathEquation equationOverload2 = new MathEquation('d');
        equationOverload2.execute(leftInt1, rightDbl1);
        System.out.println(leftInt1 + " " + "d" + " " + rightDbl1 + " = " + equationOverload2.getResult());
        System.out.println("-------------------------------");
        System.out.println("      Using Inheritance        ");
        System.out.println("-------------------------------");



        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(100, 200),
                new Subtracter(200, 100),
                new Multiplier(100, 33)
        };

        for(CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.println("Result = " + calculator.getResult());
        }
        System.out.println("-------------------------------");


        // Chapter 10

        String[] statements = {
                "add 1.0",          // Error : Incorrect number of values
                "add xx 25.0",      // Error : non-numeric data
                "addX 23.0 23.0",   // Error : Invalid Command
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        // Write CalculateHelper and then come back here to print ...

        System.out.println("*****  Using Enumerated Data Type & Custom Exception   *****");
        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements){
            try {
                helper.process(statement);
                System.out.println(helper);
                //System.out.println(helper.leftVal + helper.rightVal + " = " + helper.result) ;
                System.out.println("-------------------------------------------");
            } catch(InvalidStatementException e){
                System.out.println(e.getMessage());
                if(e.getCause() != null) {
                    System.out.println("Original Exception : " + e.getCause().getMessage());
                }
            }
        }



    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
    }





}

