package tasktypes;

public class Deadline extends Task {
    private final String by;

    public Deadline(String description, String by) {
        super(description, TypeOfTask.Deadlines);
        this.by = by;
    }

    public Deadline(String description, String by, boolean isDone) {
        super(description, TypeOfTask.Deadlines, isDone);
        this.by = by;
    }

    public String getBy() {
        return by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }

    public char getTaskCharacter() {
        return 'D';
    }

    public String getStorableString() {
        int isDoneInteger = getIsDone() ? 1 : 0;
        return getTaskCharacter() + " | " + isDoneInteger +
                " | " + getDescription() + " | " + getBy();
    }
}
