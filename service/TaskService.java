package service;

import model.*;
import java.util.*;
import java.time.LocalDate;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();
    private int idCounter = 1;

    public void addTask(String title, String category,
                        String priority, LocalDate dueDate, String email) {

        Task task = new Task(idCounter++, title, category, priority, dueDate, email);
        tasks.add(task);
        System.out.println("✅ Task added successfully");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task t : tasks) {
            System.out.println(
                t.getId() + " | " + t.getTitle() + " | " +
                t.getCategory() + " | " + t.getPriority() + " | " +
                t.getDueDate() + " | " + t.getStatus()
            );
        }
    }

    public void markTasks(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {

                if (t.getStatus() == TaskStatus.PENDING) {
                    t.setStatus(TaskStatus.COMPLETED);
                    System.out.println("✔ Task marked as COMPLETED");
                } else {
                    t.setStatus(TaskStatus.PENDING);
                    System.out.println("↩ Task marked as PENDING");
                }

                return;
            }
        }
        System.out.println("❌ Task not found");
    }


    public void deleteTask(int id) {
        tasks.removeIf(t -> t.getId() == id);
        System.out.println("🗑 Task deleted");
    }


}
