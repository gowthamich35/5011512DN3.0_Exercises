package company;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Design system architecture", "In Progress"));
        taskList.addTask(new Task(2, "Develop front-end", "Pending"));
        taskList.addTask(new Task(3, "Set up CI/CD pipeline", "Completed"));
        System.out.println();
        
        // Searching a task
        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println("Found: " + task);
        } else {
            System.out.println("Task not found.");
        }
        System.out.println();
        
        // Traversing tasks
        System.out.println("All tasks:");
        taskList.traverseTasks();
        System.out.println();
        
        // Deleting a task
        taskList.deleteTask(2);
        System.out.println();
        
        // Traversing tasks again
        System.out.println("All tasks after deletion:");
        taskList.traverseTasks();
    }
}
