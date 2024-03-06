import java.util.Date;

public class HighPriorityTask extends RegularTask {
    private TeamMember escalationContact;

    public HighPriorityTask(String title, String description, Date dueDate, TeamMember escalationContact) {
        super(title, description, dueDate);
        this.escalationContact = escalationContact;
    }

    public TeamMember getEscalationContact() {
        return escalationContact;
    }

    public void setEscalationContact(TeamMember escalationContact) {
        this.escalationContact = escalationContact;
    }
}
