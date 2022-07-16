import java.util.*;

class ToDoList {
    private PriorityQueue<Task> tasks; 
    
    public ToDoList() {
        tasks = new PriorityQueue();
    } 
    public void addTask(int priority, String description) {
        Task a = new Task(priority, description);
        tasks.add(a);
    } 
    public Task nextTask() {
        Task a = tasks.poll();
        return a;
    }
}