package ToDoLIstProject;

import Test.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    // Main Method.

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Test.Task> tasks = new ArrayList<>();
        ArrayList<Test.Task> doneTasks = new ArrayList<>();

        label:
        for(;;) {

            System.out.println("\nCommand panel: \n");
            System.out.println("Add new task - add.");
            System.out.println("Remove a task - remove.");
            System.out.println("List all tasks - list.");
            System.out.println("List tasks sorted by importantcy - listIm.");
            System.out.println("Check a task a done - done.");
            System.out.println("List all done tasks - listDone.");
            System.out.println("Exit Program - exit.");
            System.out.print("Command: ");
            String command = scanner.nextLine();
            System.out.println();

            switch (command) {
                case "add":
                    addTask(tasks);
                    break;

                case "remove":
                    removeTask(tasks);
                    break;

                case "list":
                    listAllTasks(tasks);
                    break;

                case "listIm":
                    sortByImportantcy(tasks);
                    break;

                case "done":
                    markDone(tasks,doneTasks);
                    break;

                case "listDone":
                    listDoneTasks(doneTasks);
                    break;

                case "exit":
                    break label;

                default:
                    System.out.println("Invalid Command!");
                    break;
            }
        }
    }

    // Add Task Method

    public static void addTask(ArrayList<Test.Task> tasks){

        Scanner scanner = new Scanner(System.in);
        Test.Task newTask = new Test.Task();

        System.out.print("Enter task name: ");
        newTask.setTaskName(scanner.next());
        System.out.print("Enter task's body: ");
        newTask.setTaskBody(scanner.next());
        System.out.print("Enter task's Importantcy: ");
        newTask.setTaskImportantcy(scanner.nextInt());
        System.out.print("Enter task's deadline: ");
        newTask.setTaskDeadline(scanner.next());

        tasks.add(newTask);

    }

    // Remove Task Method

    public static void removeTask(ArrayList<Test.Task> tasks){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the task you want to remove: ");
        String taskName = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i <= tasks.size() - 1; i ++){
            if (tasks.get(i).getTaskName().equals(taskName)){
                tasks.remove(i);
                flag = false;
                System.out.println("Task " + taskName + " removed successfully!");
                break;
            }
            else {
                flag = true;
            }
        }
        if (flag){
            System.out.println("There is no tasks with this name!");
        }

    }

    // List All Tasks Method

    public static void listAllTasks(ArrayList<Test.Task> tasks){

        for (int i = 0; i <= tasks.size() - 1; i ++){
            System.out.println(tasks.get(i));
        }

    }

    // Sort by Importantcy Method

    public static void sortByImportantcy(ArrayList<Test.Task> tasks){

        tasks.sort(new Comparator<>() {
            public int compare(Test.Task o1, Test.Task o2) {
                return Integer.compare(o2.getTaskImportantcy(), o1.getTaskImportantcy());
            }
        });

        for (int i = 0; i <= tasks.size() - 1; i ++){
            System.out.println(tasks.get(i));
        }

    }

    // Mark Task as Done Method

    public static void markDone(ArrayList<Test.Task> tasks, ArrayList<Test.Task> doneTasks){

        Scanner scanner = new Scanner(System.in);
        Test.Task doneTask = new Test.Task();

        System.out.print("Enter the done task's name: ");
        String taskName = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < tasks.size(); i ++){
            if (tasks.get(i).getTaskName().equals(taskName)){
                tasks.get(i).setDone(true);
                System.out.println("Task marked as done!");
                doneTask.setTaskName(tasks.get(i).getTaskName());
                doneTask.setTaskBody(tasks.get(i).getTaskBody());
                doneTask.setTaskImportantcy(tasks.get(i).getTaskImportantcy());
                doneTask.setTaskDeadline(tasks.get(i).getTaskDeadline());
                doneTasks.add(doneTask);
                flag = false;
                break;
            }
            else {
                flag = true;
            }
        }

        if (flag){
            System.out.println("There is no tasks with that name: " + taskName);
        }

        for (int i = 0; i < tasks.size(); i ++){
            if (tasks.get(i).isDone()){
                tasks.remove(i);
            }
        }

    }

    // List all Done Tasks Method

    public static void listDoneTasks(ArrayList<Task> doneTasks){

        for (int i = 0; i <= doneTasks.size() - 1; i ++){
            System.out.println(doneTasks.get(i));
        }

    }

}

