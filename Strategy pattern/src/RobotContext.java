// Context class to hold the robot's state information
class RobotContext {
    private String position;          // Position of the robot
    private String nearbyObstacles;   // Information about nearby obstacles

    // Constructor to initialize context
    public RobotContext(String position, String nearbyObstacles) {
        this.position = position;
        this.nearbyObstacles = nearbyObstacles;
    }

    // Getter methods for position and nearby obstacles
    public String getPosition() {
        return position;
    }

    public String getNearbyObstacles() {
        return nearbyObstacles;
    }
}