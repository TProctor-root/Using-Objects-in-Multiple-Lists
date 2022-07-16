import java.util.*;

class Gradebook {
    private Map<String, String> grades; 
    
    public Gradebook() {
        grades = new HashMap<String, String>();
    } 
    public void addEntry(String name, String grade) {
        if(grades.containsKey(name) == false) {
        	grades.put(name, grade);
        }
        else {
        	grades.replace(name, grade);
        }
    } 
    public void removeEntry(String name) {
        if(grades.containsKey(name) == false) {
            
        }
        else {
        	grades.remove(name);
        }
    }
    public void modifyEntry(String name, String grade) {
        if(grades.containsKey(name) == false) {
            
        }
        else {
        	grades.replace(name, grade);
        }
    }
    public String[] getEntries() {
        String[] a = new String[grades.size()];
        int b = 0;
        
        TreeMap<String, String> x = new TreeMap<>();
        x.putAll(grades);
        
        for(Map.Entry<String, String> z : x.entrySet()) {
            a[b++] = (z.getKey() + " " + z.getValue());
        }
        
        return a;
    }
} 