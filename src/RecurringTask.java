import java.util.Date;

public class RecurringTask extends RegularTask {
    private String recurrencePattern;

    public RecurringTask(String title, String description, Date dueDate, String recurrencePattern) {
        super(title, description, dueDate);
        this.recurrencePattern = recurrencePattern;
    }

    public String getRecurrencePattern() {
        return recurrencePattern;
    }

    public void setRecurrencePattern(String recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }
}

