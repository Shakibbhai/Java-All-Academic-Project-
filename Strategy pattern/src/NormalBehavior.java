class NormalBehavior implements RobotBehavior {
    @Override
    public void execute(RobotContext context) {
        System.out.println("Robot at position " + context.getPosition() + " is behaving normally.");
        // Example logic for normal behavior:
        // The robot might move at a regular pace or monitor its surroundings.
    }
}