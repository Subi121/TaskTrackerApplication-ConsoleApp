package model;

import java.time.LocalDate;

public class Task {

    private int id;
    private String title;
    private String category;
    private String priority;
    private LocalDate dueDate;
    private TaskStatus status;
    private String email;

    public Task(int id, String title, String category,
                String priority, LocalDate dueDate, String email) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.priority = priority;
        this.dueDate = dueDate;
        this.email = email;
        this.status = TaskStatus.PENDING;
    }

    // Getters & setters (Encapsulation)
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getPriority() { return priority; }
    public LocalDate getDueDate() { return dueDate; }
    public TaskStatus getStatus() { return status; }
    public String getEmail() { return email; }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
