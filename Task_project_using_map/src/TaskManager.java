import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskManager {
   private  Map<String,Task> taskmap;
   private  PriorityQueue<Task> taskPriorityQueue;


    public TaskManager() {
        taskmap = new HashMap<>();
        taskPriorityQueue = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority));
    }
    public void addtask(Task task){
    taskmap.put(task.getTitle(),task);
    taskPriorityQueue.add(task);
    }
    public void deletetask(String tittle){
        Task taskToRemove = taskmap.get(tittle);
        if (taskToRemove != null) {
            taskmap.remove(tittle);
            taskPriorityQueue.remove(taskToRemove);
        } else {
            System.out.println("Task not found: " + tittle);
        }
    }
    public void changeTaskPriority(String title, int newPriority) {
        Task taskToChangePriority = taskmap.get(title);
        if (taskToChangePriority != null) {
            taskPriorityQueue.remove(taskToChangePriority);
            taskToChangePriority.setPriority(newPriority);
            taskPriorityQueue.add(taskToChangePriority);
        } else {
            System.out.println("Task not found: " + title);
        }
    }
    public Task getHighestPriorityTask() {
        return taskPriorityQueue.poll();
    }

    // Other methods for task management

    // Exception handling
    public void handleException(Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        // Log the exception or perform other error-handling actions
    }
}

