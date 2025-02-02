class DefensiveBehavior implements RobotBehavior {
    @Override
    public void execute(RobotContext context) {
        System.out.println("Robot at position " + context.getPosition() + " is behaving defensively.");
        // Example logic for defensive behavior:
        // The robot might scan for nearby obstacles and move cautiously.
        String obstacles = context.getNearbyObstacles();
        if (obstacles != null && !obstacles.isEmpty()) {
            System.out.println("Detected obstacles: " + obstacles + ". Moving cautiously to avoid them.");
        } else {
            System.out.println("No obstacles detected. Maintaining a protective stance.");
        }
    }
}