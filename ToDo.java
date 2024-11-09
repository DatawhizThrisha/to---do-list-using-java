import java.util.ArrayList;  
import java.util.Scanner; 

public class ToDo{
    public static ArrayList <String> taskList = new ArrayList<>();
static void displaytask(){
        System.out.println("To-Do task list:");
        System.out.println("1.Add a Task:");
        System.out.println("2.Remove Task");
        System.out.println("3.view the Task");
        System.out.println("4.Exit");
    }
    public static void addTask(String task) {  
        taskList.add(task);  
        System.out.println("Task " + task + " added!");  
    }
    public static void removeTask(String task){
        if(taskList.remove(task)){
            System.out.print("Task" + task + " removed" );
        }
        else{
            System.out.print("task not found error!!");
        }
    }
    
    public static void viewTasks() {  
        if (taskList.isEmpty()) {  
            System.out.println("the list is empty");  
        } else {  
            System.out.println("Your To-Do List:");  
            for (int i = 0; i < taskList.size(); i++) {  
                System.out.println((i + 1) + ". " + taskList.get(i));  
            }  
        }  
    }  
    
public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int choice;
        do {  
            displaytask();  
            System.out.print("Choose an option (1-4): ");  
            choice = a.nextInt();  
           a.nextLine();

            switch (choice) {  
                case 1:  
                    System.out.print("Enter the task: ");  
                    String taskToAdd = a.nextLine();  
                    addTask(taskToAdd);  
                    break;
                case 2:
                    System.out.print("Enter the task to remove:");
                    String taskToremove = a.nextLine();
                    removeTask(taskToremove);
                    break;
                case 3:
                   viewTasks();
                   break;
                case 4:
                     System.out.print("Exit!!");
                default:
                    System.out.print("thank you!!");
            }
        }while(choice!=4);
}
}
