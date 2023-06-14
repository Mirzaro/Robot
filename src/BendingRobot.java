public class BendingRobot extends Robot {
    private double maxBendAngle;

    public BendingRobot(double maxBendAngle, String unitName) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bendAngle) {
        double normalizedBendAngle = bendAngle % 360;
        if (normalizedBendAngle < 0) {
            normalizedBendAngle += 360;
        }

        if (normalizedBendAngle <= maxBendAngle) {
            System.out.println("Bending at angle: " + normalizedBendAngle);
        } else {
            System.out.println("Cannot bend beyond maximum angle: " + maxBendAngle);
        }
    }

    @Override
    public void lift(double v) {

    }

}



