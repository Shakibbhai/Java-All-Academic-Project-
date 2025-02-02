// Robot class which utilizes a behavior strategy and a context
class Robot {
    private String id;               // Unique identifier for the robot
    private RobotBehavior behavior;  // Current behavior of the robot
    private RobotContext context;    // Context information for the robot

    // Constructor to initialize a robot with an ID, behavior, and context
    public Robot(String id, RobotBehavior behavior, RobotContext context) {
        this.id = id;
        this.behavior = behavior;
        this.context = context;
    }

    // Method to change the robot's behavior dynamically
    public void setBehavior(RobotBehavior behavior) {
        this.behavior = behavior;
    }

    // Method to perform the action based on current behavior
    public void performAction() {
        behavior.execute(context); // Execute the current behavior with the given context
    }
}