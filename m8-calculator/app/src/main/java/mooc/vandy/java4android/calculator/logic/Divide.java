package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    private int int1;
    private int int2;

    public Divide(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public int divideNumbersQuotient(){
        return int1/int2;
    }

    public int divideNumberRemainder(){
        return int1%int2;
    }
}
