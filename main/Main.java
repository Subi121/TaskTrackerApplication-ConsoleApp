package main;

import service.*;
import model.*;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        TaskService manager = new TaskService();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("d.M.yyyy");


        while (true) {
            System.out.println("\n--- TASK TRACKER ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Category: ");
                    String cat = sc.nextLine();

                    System.out.print("Priority (LOW/MEDIUM/HIGH): ");
                    String pr=sc.nextLine();
                    System.out.print("Due date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    manager.addTask(title, cat, pr, date, email);
                    break;

                case 2:
                    manager.viewTasks();
                    break;

                case 3:
                    System.out.print("Task ID: ");
                    manager.markTasks(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Task ID: ");
                    manager.deleteTask(sc.nextInt());
                    break;


                case 5:
                    System.out.println("Bye 👋");
                    return;
            }
        }
    }
}
