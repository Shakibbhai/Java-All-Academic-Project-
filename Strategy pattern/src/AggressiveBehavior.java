// Implement different Robot Behaviors
class AggressiveBehavior implements RobotBehavior {
    @Override
    public void execute(RobotContext context) {
        System.out.println("Robot at position " + context.getPosition() + " is behaving aggressively.");

    }
}