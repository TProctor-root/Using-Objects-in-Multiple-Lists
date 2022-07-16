import java.util.ArrayList;
import java.util.Collections;

class Roster {
    private ArrayList<Person> a;
    
    public Roster() {
        a = new ArrayList<>();
    }
    public void addPerson(int id, String name) {
        a.add(new Person(id, name));
    } 
    public boolean removePerson(String name) {
        for(Person z : a) {
            if(z.getName().equals(name) == false) {
                
            }
            else {
            	a.remove(z);
                return true;
            }
        }
        return false;
    }
    public boolean removePerson(int id) {
        for(Person z : a) {
            if(id != z.getId()) {
                
            }
            else {
            	a.remove(z);
                return true;
            }
        }
        return false;
    }
    public Person findPerson(String name) {
        for(Person z : a) {
            if(z.getName().equals(name) == false) {
                
            }
            else {
            	return z;
            }
        }
        return null;
    }
    public Person findPerson(int id) {
        for(Person z : a) {
            if(id != z.getId()) {
                
            }
            else {
            	return z;
            }
        }
        return null;
    }
    public String getNamesInAlphaOrder() {
        ArrayList<Person> x;
        x = new ArrayList<>(a);
        Collections.sort(x);
        
        String mno = "";
        int i = 0;
        for(Person z : x) {
        	if(i == 0) {
        		mno = mno + z.getName();
        		i++;
        	}
        	else {
        		mno = mno + " " + z.getName();
        	}
        }
        
        return mno;
    }
}