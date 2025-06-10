package generics;

import collections.Task;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setValue("Hello");
        System.out.println(box.getValue());

        Box<Integer> number = new Box<>();
        number.setValue(221);
        System.out.println(number.getValue());

        Box<Task> taskBox = new Box<>();
        taskBox.setValue(new Task("Приготовить завтрак!"));
        System.out.println(taskBox.getValue());
    }
}
