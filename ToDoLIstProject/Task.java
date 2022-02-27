package ToDoLIstProject;

public class Task{

    private String taskName;
    private String taskBody;
    private int taskImportantcy;
    private String taskDeadline;
    private boolean isDone = false;

    @Override
    public String toString(){
        return (
                "Task name: " + this.getTaskName() + "\n" +
                        "Task Body: " + this.getTaskBody() + "\n" +
                        "Task Importantcy: " + getTaskImportantcy() + "\n" +
                        "Task DeadLine: " + getTaskDeadline() + "\n \n"
        );
    }

    public Task(String taskName, String taskBody, int taskImportantcy, String taskDeadline) {
        this.taskName = taskName;
        this.taskBody = taskBody;
        this.taskImportantcy = taskImportantcy;
        this.taskDeadline = taskDeadline;
    }

    public Task () {
        this.taskName = "";
        this.taskBody = "";
        this.taskImportantcy = 0;
        this.taskDeadline = "";
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskBody() {
        return taskBody;
    }

    public void setTaskBody(String taskBody) {
        this.taskBody = taskBody;
    }

    public int getTaskImportantcy() {
        return taskImportantcy;
    }

    public void setTaskImportantcy(int taskImportantcy) {
        this.taskImportantcy = taskImportantcy;
    }

    public String getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(String taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}

