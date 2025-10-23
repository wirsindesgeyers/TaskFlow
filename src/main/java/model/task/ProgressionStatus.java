package model.task;

public enum ProgressionStatus {
    TO_DO("To Do"),
    IN_PROGRESS("In Progress"),
    DONE("Done");

    private String description;

    ProgressionStatus(String description) {
        this.description = description;
    }
}
