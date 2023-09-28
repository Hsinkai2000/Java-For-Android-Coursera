package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
       extends House {

    private boolean mSecondFloor;

    public Cottage(int dimensions, int mLotLength, int mLotWidth) {
        super(dimensions, dimensions, mLotLength, mLotWidth);
    }

    public Cottage(int dimensions, int mLotLength, int mLotWidth, String owner, boolean mSecondFloor) {
        super(dimensions, dimensions, mLotLength, mLotWidth, owner);
        this.mSecondFloor = mSecondFloor;
    }

    public boolean hasSecondFloor(){
        return mSecondFloor;
    }

    public String toString(){
        String base = super.toString();
        if(hasSecondFloor()){
            base+= "; is a two story cottage";
        }
        else{
            base += "; is a cottage";
        }
        return base;
    }
}

