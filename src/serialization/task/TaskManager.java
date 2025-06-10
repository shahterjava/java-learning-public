package serialization.task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager implements Serializable{
    private List<Task> tasks = new ArrayList<>();
    private final String FILE_NAME = "src/serialization/task/tasks.dat";


    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public void showTasks() {
        if(tasks.isEmpty()){
            System.out.println("Нет задач!");
        }else{
            for (int i = 0; i < tasks.size() ; i++) {
                System.out.println((i+1) + ". " + tasks.get(i));
            }
        }
    }

    public void saveTasks() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(tasks);
            System.out.println("Задачи сохранены!");
            out.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }

    public void loadTasks() {
        File file = new File(FILE_NAME);
        if(!file.exists()) return;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
            tasks =(List<Task>) in.readObject();
            in.close();
        }catch (IOException e){
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Класс не найден!");
        }

    }
}