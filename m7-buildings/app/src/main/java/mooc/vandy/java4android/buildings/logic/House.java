package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
       extends Building {

    private String mOwner;
    private boolean mPool;

    public House(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        mOwner=null;
        mPool=false;
    }

    public House(int mLength, int mWidth, int mLotLength, int mLotWidth, String mOwner) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mOwner = mOwner;
    }

    public House(int mLength, int mWidth, int mLotLength, int mLotWidth, String mOwner, boolean mPool) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mOwner = mOwner;
        this.mPool = mPool;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool(){
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    public String toString(){
        String base = "Owner: " + getOwner();
        if(hasPool()){
            base += "; has a pool";
        }
        if(calcBuildingArea() < calcLotArea()){
            base += "; has a big open space";
        }
        return base;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof House) {
            House otherHouse = (House) obj;
            if (otherHouse.calcBuildingArea() == this.calcBuildingArea() && otherHouse.hasPool() == this.hasPool())
                return true;
        }
        return false;
    }
}
