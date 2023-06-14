public class LiftingRobot extends Robot {
    private double maxLiftHeight;
// Constructors
    public LiftingRobot(double maxLiftHeight, String unitName) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    @Override
    public void bend(double v) {

    }
// maximum Hoogte zetten
    public void lift(double height) {
        if (height <= maxLiftHeight) {
            System.out.println("Lifting to height: " + height);
        } else {
            System.out.println("Cannot lift beyond maximum height: " + maxLiftHeight);
        }
    }}


