import java.util.ArrayList;
import java.util.Stack;

class Driveway {
    private Stack<Integer> driveway; 
    private Stack<Integer> street;
    
    public Driveway() {
    	street = new Stack<Integer>();
        driveway = new Stack<Integer>();
    }
    public String getDriveway() {
        String a = "Driveway: ";
            
        int z = 0;
        while(driveway.size() > z) {
        	a = a + driveway.get(z) + " ";
        	z++;
        }
        
        if(0 < driveway.size()) {
            a = a.trim();
        }
        return a;
    }
    public String getStreet() {
        String a = "Street: ";
           
        int z = 0;
        while(street.size() > z) {
        	a = a + street.get(z) + " ";
        	z++;
        }
        
        if(0 < street.size()) {
            a = a.trim();
        }
        return a;
    }
    public ArrayList<String> add(int licensePlate) {
        ArrayList<String> a;
        a = new ArrayList<String>();      
        
        if(driveway.contains(licensePlate) == true) {
        	a.add("That car is already in the driveway.");
        }
        else {
        	driveway.add(licensePlate);
            a.add(getDriveway());
            a.add(getStreet());
        }
	
        return a;
    }
    public ArrayList<String> remove(int licensePlate) {
        ArrayList<String> a;
        a = new ArrayList<String>();
        int b;
        
        if(licensePlate == driveway.peek()) {
            driveway.pop();
            a.add(getDriveway());
            a.add(getStreet());
        }
        else if(driveway.contains(licensePlate) == true) {
            while(licensePlate != driveway.peek()) {
                b = driveway.pop();
                street.add(b);
                a.add(getDriveway());
                a.add(getStreet());
            }
            driveway.pop();
            while(street.isEmpty() == false) {
                b = street.pop();
                driveway.add(b);
                a.add(getDriveway());
                a.add(getStreet());
            }
        }
        else {
            a.add("That car is not in the driveway.");
        }
        
        return a;
    }
}
