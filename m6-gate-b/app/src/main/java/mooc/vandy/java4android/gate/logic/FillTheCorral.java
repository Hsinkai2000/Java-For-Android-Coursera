package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here

    public void setCorralGates(Gate[] gates, Random rand){
        for (int i = 0; i < gates.length; i++) {
            int num = rand.nextInt(3)-1;
            gates[i].setSwing(num);
            if (num == -1){
                mOut.println(String.format("Gate %d: is open and swings to exit the pen only", i));
            } else if (num == 0) {
                mOut.println(String.format("Gate %d: is closed", i));
            }
            else {
                mOut.println(String.format("Gate %d: is open and swings to enter the pen only", i));
            }
        }
    }

    public boolean anyCorralAvailable(Gate[] corral){
        for (Gate g:
                corral) {
            if (g.getSwingDirection() == Gate.IN){
                return true;
            }
        }
        return false;
    }

    public int corralSnails(Gate[] corral, Random rand){
        int count=0;
        int snailsOut = 5;
        while (snailsOut > 0) {
            int randNum = rand.nextInt(corral.length);
            int movingNum = rand.nextInt(snailsOut)+1;
            snailsOut -= corral[randNum].thru(movingNum);
            mOut.println(String.format("%d are trying to move through corral %s", movingNum,randNum));
            count++;
        }
        mOut.println(String.format("It took %d attempts to corral all of the snails", count));
        return count;
    }

}
