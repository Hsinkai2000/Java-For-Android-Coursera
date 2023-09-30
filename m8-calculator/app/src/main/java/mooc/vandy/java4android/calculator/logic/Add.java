package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    private int int1;
    private int int2;

    public Add(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public int addNumbers(){
        return int1+int2;
    }
}
