package serialization.task;

import java.io.Serializable;

public class Task implements Serializable {
    private String title;
    private boolean done = false;

    public Task(String title) {
        this.title = title;
    }

    public void markDone(){
        this.done = true;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return done ? "[✔]" : "[ ]" + " : " + title ;
    }
}
