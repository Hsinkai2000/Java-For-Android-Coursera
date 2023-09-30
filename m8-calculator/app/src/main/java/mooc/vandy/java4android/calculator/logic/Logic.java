package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;

        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        switch (operation){
            case 1://addition
                mOut.print(String.format("%d",new Add(argumentOne,argumentTwo).addNumbers()));
                break;
            case 2://subtraction
                mOut.print(String.format("%d",new Subtract(argumentOne,argumentTwo).subtractNumbers()));
                break;
            case 3://multiplication
                mOut.print(String.format("%d",new Multiply(argumentOne,argumentTwo).multiplyNumbers()));
                break;
            case 4://division
                if (argumentTwo==0){
                    mOut.print("second number cannot be 0");
                    break;
                }
                Divide d = new Divide(argumentOne,argumentTwo);
                int q = d.divideNumbersQuotient();
                int r = d.divideNumberRemainder();
                mOut.print(String.format("%d R:%d",q,r));
                break;
            default://others
                break;

        }
        
    }
}
