import java.util.*;

class Task {
    private final String title;
    private final String description;
    private final Date dueDate;
    private int priority; // 1 being the highest priority

    public Task(String title, String description, Date dueDate, int priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }
}