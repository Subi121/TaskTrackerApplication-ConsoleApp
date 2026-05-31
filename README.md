# ✅ Task Tracker Application

![Java](https://img.shields.io/badge/Java-17-orange)
![Type](https://img.shields.io/badge/Type-Console%20App-blue)
![Status](https://img.shields.io/badge/status-complete-brightgreen)
![License](https://img.shields.io/badge/license-MIT-green)

A console-based Task Tracker built in **Java** for managing daily tasks with priority levels, categories, due dates, and status tracking — structured using OOP principles and package-based architecture.

---
## 🔗 Live Demo  
🎥 Demo Video: [Watch Demo](https://drive.google.com/file/d/1evApbWLrD-d_jpUNTuwbb_qhYCmwouU3/view?usp=sharing)  

---

## ✨ Features

* Add, view, and delete tasks
* Mark tasks as completed or pending
* Task categorization and priority management
* Due date handling using `LocalDate`
* `TaskStatus` enum for clean state management
* Menu-driven console interface

---

## 🛠️ Tech Stack

* Java 17
* OOP — Encapsulation, Enums, Classes & Objects
* Collections Framework (`ArrayList`)
* Java Time API (`LocalDate`)

---

## 📂 Project Structure

```
Task-Tracker-Application/
├── main/
│   └── Main.java          → Menu interaction and user input
├── model/
│   ├── Task.java          → Task entity (title, priority, due date, status)
│   └── TaskStatus.java    → Enum for task states (PENDING, COMPLETED)
└── service/
    └── TaskService.java   → Business logic for all task operations
```

---

## 🚀 Run the Project

```bash
git clone https://github.com/Subi121/task-tracker-app.git
cd task-tracker-app
javac main/Main.java model/*.java service/*.java
java main.Main
```

---

## 🔭 Future Improvements

* File handling for persistent task storage
* Search and filter by priority, category, or due date
* Email reminders for upcoming due dates
* Database integration using JDBC / MySQL
* GUI version using JavaFX or Swing

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
