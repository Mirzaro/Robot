public class RobotApplication {
    public static void main(String[] args) {

        LiftingRobot liftingRobot = new LiftingRobot(10.0, "Lifter");
        BendingRobot bendingRobot = new BendingRobot(180.0, "Bender");
        CrazyRobot crazyRobot = new CrazyRobot("Gregory");


        System.out.println("Testing LiftingRobot:");
        liftingRobot.lift(5.0); // Output: Lifting to height: 5.0
        liftingRobot.lift(15.0); // Output: Cannot lift beyond maximum height: 10.0


        System.out.println("\nTesting BendingRobot:");
        bendingRobot.bend(45.0); // Output: Bending at angle: 45.0
        bendingRobot.bend(270.0); // Output: Cannot bend beyond maximum angle: 180.0


        System.out.println("\nTesting CrazyRobot:");
        crazyRobot.lift(8.0); // Output: Lifting to height: 8.0
        crazyRobot.lift(12.0); // Output: Cannot lift beyond maximum height: 10.0


        System.out.println("\nTesting CrazyRobot's bending (original name: " + crazyRobot.getUnitName() + "):");
        crazyRobot.bend(90.0); // Output: Bending at angle: 90.0


        System.out.println("Updated name of CrazyRobot: " + crazyRobot.getUnitName()); // Output: yrogerG
    }
}
