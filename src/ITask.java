import java.util.Date;

public interface ITask {
    String getTitle();
    String getDescription();
    Date getDueDate();
    EnumStatusType getStatus();
    void setPriority(EnumPriorityType priority);
    void assignTo(TeamMember member);
}
