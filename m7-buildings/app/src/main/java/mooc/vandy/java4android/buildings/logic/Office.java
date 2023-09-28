package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
       extends Building {

    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices;

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mBusinessName = null;
        this.mParkingSpaces=0;
        sTotalOffices++;
    }

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth, String mBusinessName) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mBusinessName = mBusinessName;
        sTotalOffices++;
    }

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth, String mBusinessName, int mParkingSpaces) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mBusinessName = mBusinessName;
        this.mParkingSpaces = mParkingSpaces;
        sTotalOffices++;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    public static int getTotalOffices() {
        return sTotalOffices;
    }

    public String toString(){
        String base ="Business: ";
        if (mBusinessName == null){
            base += "unoccupied";
        }
        else {
            base += getBusinessName();
        }
        if (getParkingSpaces()>0){
            base += "; has " + getParkingSpaces() + " parking spaces";
        }
        base += " (total offices: " + getTotalOffices() + ")";
        return base;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Office) {
            Office otherOffice = (Office) obj;
            if (otherOffice.calcBuildingArea() == this.calcBuildingArea() && otherOffice.getParkingSpaces() == this.getParkingSpaces())
                return true;
        }
        return false;
    }
}
