package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here

    public static int IN=1;
    public static int OUT =-1;
    public static int CLOSED =0;
    private int mSwing;

    public Gate() {
    }

    public boolean setSwing(int mSwing) {
        if (mSwing != IN && mSwing != OUT && mSwing != CLOSED) {
            return false;
        }
        this.mSwing = mSwing;
        return true;
    }

    public boolean open (int direction){
        if (direction == CLOSED){
            return false;
        }
        setSwing(direction);
        return true;
    }

    public void close(){
        this.mSwing = CLOSED;
    }

    public int getSwingDirection(){
        return this.mSwing;
    }

    public int thru(int count){
        if(getSwingDirection() == IN){
            return count;
        } else if (getSwingDirection() == OUT) {
            return -count;
        }
        return 0;

    }

    @Override
    public String toString(){
        if (getSwingDirection() == CLOSED){
            return "This gate is closed";
        } else if (getSwingDirection() == IN) {
            return "This gate is open and swings to enter the pen only";
        } else if (getSwingDirection() == OUT) {
            return "This gate is open and swings to exit the pen only";
        }
        return "This gate has an invalid swing direction";
    }
    
}
