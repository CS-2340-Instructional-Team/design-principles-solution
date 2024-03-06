import java.util.Date;

public class Run {
    public static void main(String[] args) {
        TeamMember john = new TeamMember("John Doe", "john@example.com");
        ProjectLead jane = new ProjectLead("Jane Smith", "jane@example.com");

        RegularTask task1 = new RegularTask("Write report", "Write monthly report", new Date());
        RecurringTask task2 = new RecurringTask("Check updates", "Check for system updates", new Date(), "Every Monday");
        HighPriorityTask task3 = new HighPriorityTask("Fix bug", "Fix critical bug", new Date(), jane);

        Project project = new Project("Software Development", "Develop a new software application", new Date(), new Date());
        project.addTask(task1);
        project.addTask(task2);
        project.addTask(task3);
        project.addMember(john);
        project.addMember(jane);

        // Print some details to verify
        System.out.println("Project Name: " + project.getName());
        System.out.println("Number of tasks: " + project.getTasks().size());
        System.out.println("Number of team members: " + project.getMembers().size());
    }
}
