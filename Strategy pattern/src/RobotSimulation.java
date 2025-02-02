// Main class to simulate the robots
public class RobotSimulation {
    public static void main(String[] args) {
        // Create context objects for robots with initial positions and nearby obstacles
        RobotContext context1 = new RobotContext("Position1", "Obstacle1");
        RobotContext context2 = new RobotContext("Position2", "Obstacle2");

        // Create robots with initial behaviors
        Robot robot1 = new Robot("Robot1", new AggressiveBehavior(), context1);
        Robot robot2 = new Robot("Robot2", new DefensiveBehavior(), context2);

        // Perform actions with initial behaviors
        System.out.println("Initial behaviors:");
        robot1.performAction();
        robot2.performAction();

        // Dynamically change behaviors
        robot1.setBehavior(new NormalBehavior());
        robot2.setBehavior(new AggressiveBehavior());

        // Perform actions with updated behaviors
        System.out.println("\nUpdated behaviors:");
        robot1.performAction();
        robot2.performAction();

        // Further dynamic behavior changes can be tested here as needed
    }
}