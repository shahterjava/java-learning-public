package collections;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks = new ArrayList<>();

    public void addTask(String title){
        tasks.add(new Task(title));
    }
    public void removeTask(String title){
        tasks.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
    }
    public void printAllTasks(){
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
