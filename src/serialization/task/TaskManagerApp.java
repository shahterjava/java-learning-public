package serialization.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagerApp {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Task Manager app!");
        Scanner scanner = new Scanner(System.in);
        TaskManager tasks = new TaskManager();
        tasks.loadTasks();
        boolean running = true;
        while (running){
            System.out.println("Ваши возможности: \n 1.Добавить задачу\n 2.Посмотреть список задач\n 3.Сохранить в файл\n 4.Завершить работу");
            System.out.print("Выберите действие: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1" -> {
                    System.out.print("Введите задачу: ");
                    String title = scanner.nextLine();
                    tasks.addTask(title);
                    System.out.println("Задача успешно добавлена!");
                }
                case "2" -> {
                    tasks.showTasks();
                }
                case "3" -> {

                    tasks.saveTasks();
                }
                case "4" -> {
                    tasks.saveTasks();
                    System.out.println("Всего вам доброго!");
                    running = false;
                    break;
                }
                default -> System.out.println("Неверный ввод.");
            }
        }
        scanner.close();


    }
}
