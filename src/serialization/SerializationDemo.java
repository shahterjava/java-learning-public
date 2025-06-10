package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Task task = new Task("Приготовить завтрак", false);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/serialization/output.txt"));
            out.writeObject(task);
            out.close();
        } catch (Exception e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/serialization/output.txt"));
            Task loaded = (Task) in.readObject();
            in.close();
            System.out.println(loaded.toString());
        }catch(Exception e){
            System.out.println("Ошибка при чтении:" + e.getMessage());
        }
    }
}
