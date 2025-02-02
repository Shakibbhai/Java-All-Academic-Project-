import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            TaskManager taskManager = new TaskManager();

            // Example: Creating tasks and adding them to the manager
            Task task1 = new Task("Task 1", "Description 1", new Date(), 2);
            Task task2 = new Task("Task 2", "Description 2", new Date(), 5);
            Task task3 = new Task("Task 3", "Description 3", new Date(), 4);

            taskManager.addtask(task1);
            taskManager.addtask(task2);
            taskManager.addtask(task3);

            // Example: Retrieving and displaying the highest priority task
            Task highestPriorityTask = taskManager.getHighestPriorityTask();
            if (highestPriorityTask != null) {
                System.out.println("Highest Priority Task: " + highestPriorityTask.getTitle());
                System.out.println("Due Date: " + highestPriorityTask.getDueDate());
                System.out.println("Description is: "+highestPriorityTask.getDescription());
            } else {
                System.out.println("No tasks available.");
            }

            // Example: Deleting a task
            taskManager.deletetask("Task 1");

            // Example: Changing the priority of a task
            taskManager.changeTaskPriority("Task 2", 3);
        } catch (Exception e) {
            // Handle exceptions
            handleException(e);
        }
    }

    // Global exception handling (if needed)
    private static void handleException(Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
        // Log the exception or perform other error-handling actions
    }
}