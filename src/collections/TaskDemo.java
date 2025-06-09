package collections;

import java.util.ArrayList;
import java.util.List;

public class TaskDemo {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Приготовить завтрак");
        taskManager.addTask("Решить задачу");
        taskManager.addTask("Убраться дома");
        taskManager.printAllTasks();
        System.out.println();
        taskManager.removeTask("Решить задачу");
        taskManager.printAllTasks();


    }
}
