package mooc.vandy.java4android.shapes.logic;

import java.util.Locale;

import mooc.vandy.java4android.shapes.ui.OutputInterface;

import static java.lang.String.format;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
        implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /*
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough)
     */
    private final OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance
     * (which implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface out) {
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    @Override
    public void process() {
        // Get which calculation should be computed.  Do not worry
        // about the specifics of this right now.
        Shapes shapeForCalculations = mOut.getShape();

        // Store the values returned by the User Interface.
        double mLength = mOut.getLength();
        double mWidth = mOut.getWidth();
        double mHeight = mOut.getHeight();
        double mRadius = mOut.getRadius();

        // Determine which calculation to process right now.  Again,
        // do not worry about the specifics of how this works for now.
        switch (shapeForCalculations) {
            case Box:
                mOut.print("A "
                        + mLength
                        + " by "
                        + mWidth
                        + " by "
                        + mHeight
                        + " box has a volume of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", boxVolume(mLength, mWidth, mHeight)));
                mOut.println();

                mOut.print("A "
                        + mLength
                        + " by "
                        + mWidth
                        + " by "
                        + mHeight
                        + " box has a surface area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", boxSurfaceArea(mLength, mWidth, mHeight)));
                mOut.println();
                // If you are paying attention, you will notice that
                // there is no 'break;' here like there is in other
                // places, meaning that if 'Box' was selected, it will
                // run the two sets of print statements above and the
                // two statements below until the 'break;' statement.
            case Rectangle:
                mOut.print("A "
                        + mLength
                        + " by "
                        + mWidth
                        + " rectangle has a perimeter of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", rectanglePerimeter(mLength, mWidth)));
                mOut.println();

                mOut.print("A "
                        + mLength
                        + " by "
                        + mWidth
                        + " rectangle has area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", rectangleArea(mLength, mWidth)));
                mOut.println();
                break;
            case Sphere:
                mOut.print("A sphere with radius " + mRadius + " has a volume of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", sphereVolume(mRadius)));
                mOut.println();

                mOut.print("A sphere with radius " + mRadius + " has surface area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", sphereSurfaceArea(mRadius)));
                mOut.println();
                // Same here as with 'Box' above. If 'Sphere' is picked, it will run the
                // two sets of print statements above and the two below until the 'break;'
            case Circle:
                mOut.print("A circle with radius " + mRadius + " has a perimeter of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", circleCircumference(mRadius)));
                mOut.println();

                mOut.print("A circle with radius " + mRadius + " has area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", circleArea(mRadius)));
                mOut.println();
                break;
            case Triangle:
                mOut.print("A right triangle with base "
                        + mLength
                        + " and height "
                        + mWidth + " has a perimeter of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", rightTrianglePerimeter(mLength, mWidth)));
                mOut.println();

                mOut.print("A right triangle with base "
                        + mLength
                        + " and height "
                        + mWidth
                        + " has area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", rightTriangleArea(mLength, mWidth)));
                mOut.println();
                break;
            default:
                break;
        }
    }

    public static Double circleCircumference(double mRadius) {
        return Math.PI * 2 * mRadius ;
    }

    public static Double rightTrianglePerimeter(double mLength, double mWidth) {
        Double finalSide = Math.sqrt((mLength*mLength)+(mWidth*mWidth));
        return mLength+mWidth+finalSide;
    }

    public static Double circleArea(double mRadius) {

        return Math.PI*mRadius*mRadius;
    }

    public static Double rightTriangleArea(double mLength, double mWidth) {
        return 0.5* mLength*mWidth;
    }

    public static Double sphereVolume(double mRadius) {
        return (4.0/3.0) * Math.PI * Math.pow(mRadius,3);
    }

    public static Double sphereSurfaceArea(double mRadius) {
        return 4 * Math.PI * mRadius *mRadius;
    }

    public static Double rectangleArea(double mLength, double mWidth) {
        return mLength*mWidth;
    }

    public static Double rectanglePerimeter(double mLength, double mWidth) {
        return (2*mLength) + (2*mWidth);
    }

    public static Double boxSurfaceArea(double mLength, double mWidth, double mHeight) {
        return (2*mLength*mHeight) + (2*mLength*mWidth) + (2*mWidth*mHeight);
    }

    public static Double boxVolume(double mLength, double mWidth, double mHeight) {
        return mLength*mWidth*mHeight;
    }

    // TODO -- add your code here

    
}
