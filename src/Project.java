import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<ITask> tasks = new ArrayList<>();
    private List<TeamMember> members = new ArrayList<>();

    public Project(String name, String description, Date startDate, Date endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addTask(ITask task) {
        tasks.add(task);
    }

    public void removeTask(ITask task) {
        tasks.remove(task);
    }

    public void addMember(TeamMember member) {
        members.add(member);
    }

    public void removeMember(TeamMember member) {
        members.remove(member);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<ITask> getTasks() {
        return tasks;
    }

    public List<TeamMember> getMembers() {
        return members;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setTasks(List<ITask> tasks) {
        this.tasks = tasks;
    }

    public void setMembers(List<TeamMember> members) {
        this.members = members;
    }
}
