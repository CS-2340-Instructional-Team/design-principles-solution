import java.util.Date;

public class RegularTask implements ITask {
    protected String title;
    protected String description;
    protected Date dueDate;
    protected EnumStatusType status;
    protected EnumPriorityType priority;
    protected TeamMember assignedMember;

    public RegularTask(String title, String description, Date dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = EnumStatusType.NOT_STARTED;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public EnumStatusType getStatus() {
        return status;
    }

    @Override
    public void setPriority(EnumPriorityType priority) {
        this.priority = priority;
    }

    @Override
    public void assignTo(TeamMember member) {
        this.assignedMember = member;
    }
}

