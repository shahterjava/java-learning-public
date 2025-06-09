package collections;

public class Task {
    private String title;
    private boolean done;

    public Task(String title, boolean done) {
        this.title = title;
        this.done = false;
    }

    public Task(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Задача: " + title + ". Статус выполения: "+ done;
    }

    public String getTitle() {
        return title;
    }
}
