class Task implements Comparable<Task>{
    private int a;
    private String b;
    
    public Task(int priority, String description) {
        a = priority;
        b = description;
    } 
    public int getPriority() {
        return a;
    }
    public String getDescription() {
        return b;
    }
    
    @Override
    public int compareTo(Task otherObject) {
    	if(getPriority() < otherObject.getPriority()) {
            return -1;
        }
    	else if(getPriority() > otherObject.getPriority()) {
            return 1;
        }
        else  {
            return 0;
        }
    }
}