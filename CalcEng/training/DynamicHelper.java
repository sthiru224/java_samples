package com.adobe.marketing.mobile.training;

public class DynamicHelper {

    private MathProcessing[] handlers;

    // Constructor
    public DynamicHelper(MathProcessing[] handlers){
        this.handlers = handlers;
    }

    public String process (String statement){
        // Input  : add 10.0 30.0
        // Output : 10.0 + 30.0 = 40.0
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyword = parts[0]; // add in "add 10.0 30.0"

        MathProcessing theHandler = null;

        for(MathProcessing handler:handlers){
            if(keyword.equalsIgnoreCase(handler.getKeyword())){
                theHandler = handler;
            }
        }

        double leftVal = Double.parseDouble(parts[1]);  // 10.0
        double rightVal = Double.parseDouble(parts[2]); // 30.0
        double result = theHandler.doCalculation(leftVal,rightVal);

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandler.getSymbol());
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);
        return sb.toString();



    }
}
