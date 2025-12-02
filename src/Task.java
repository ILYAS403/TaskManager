public class Task {
    private String title;
    private String description;
    private boolean done;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.done = false;
    }

    public void markDone() { this.done = true; }

    public boolean isDone() { return done; }

    public String toString() {
        return "[" + (done ? "X" : " ") + "] " + title + ": " + description;
    }
}
