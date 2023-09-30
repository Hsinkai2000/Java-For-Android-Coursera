package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private int int1;
    private int int2;

    public Multiply(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public int multiplyNumbers(){
        return int1*int2;
    }
}
