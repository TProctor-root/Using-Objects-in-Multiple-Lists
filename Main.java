public class Main {
    
	public static int problem1_count8s(int a) {
        if(a <= 0) {
            return 0;
        }
        else {
        	if(a % 10 != 8) {
        		return problem1_count8s(a / 10);
            }
            else {
            	if((a / 10) % 10 != 8) {
                	return problem1_count8s(a / 10) + 1;
                }
                else {
                	return problem1_count8s(a / 10) + 2;
                }
            }
        }
    }
    public static boolean problem2_arrayTimesTen(int[] a, int b) {
    	boolean z = true;
    	
        if(a.length - 1 <= b) {
        	z = false;
            return z;
        }
        else if(a[b + 1] == a[b] * 10) {
	        return z;
	    }
        else {
        	return problem2_arrayTimesTen(a, b + 1);
        }
    }
    public static String problem3_addStars(String a) {
        if(a.length() <= 1 || a.equals("")) {
            return a;
        }
        else {
            return a.charAt(0) + "*" + problem3_addStars(a.substring(1));
        }
    }
    
    public static void main(String[] args) {
	System.out.println(problem1_count8s(8));
	// returns 1
        System.out.println(problem1_count8s(818)); 
        // returns 2
        System.out.println(problem1_count8s(8818)); 
        // returns 4
        System.out.println(problem1_count8s(8888)); 
        // returns 7
        
        System.out.println();
        
        System.out.println(problem2_arrayTimesTen(new int[] {1, 2, 20}, 0)); 
        // returns true
        System.out.println(problem2_arrayTimesTen(new int[] {3, 30, 0}, 0)); 
        // returns true
        System.out.println(problem2_arrayTimesTen(new int[] {3}, 0)); 
        // returns false
        
        System.out.println();
        
        System.out.println(problem3_addStars("hello")); 
        // returns "h*e*l*l*o"
        System.out.println(problem3_addStars("abc")); 
        // returns "a*b*c"
        System.out.println(problem3_addStars("ab")); 
        // returns "a*b"
        System.out.println(problem3_addStars("a")); 
        // returns "a"
        System.out.println(problem3_addStars("12345")); 
        // returns "1*2*3*4*5"
        
        System.out.println();
        
        Roster roster = new Roster();
        roster.addPerson(3, "Robert");
        roster.addPerson(5, "Adriana");
        roster.addPerson(188, "Rujun");
        roster.addPerson(9, "Anupriya");
        roster.addPerson(45, "Yizhen");
        roster.addPerson(88, "Emily");
        System.out.println(roster.getNamesInAlphaOrder()); 
        // returns "Adriana Anupriya Emily Robert Rujun Yizhen"
        System.out.println(roster.findPerson(9).getName()); 
        // returns "Anupriya" 
        System.out.println(roster.findPerson("Yizhen").getId()); 
        // returns 45
        roster.removePerson(3);
        roster.removePerson("Emily");
        System.out.println(roster.getNamesInAlphaOrder()); 
        // returns "Adriana Anupriya Rujun Yizhen"
            
        System.out.println();
        
        Driveway driveway = new Driveway(); 
        System.out.println(driveway.add(1)); 
        System.out.println(driveway.add(2)); 
        System.out.println(driveway.add(3)); 
        System.out.println(driveway.add(3)); 
        System.out.println(driveway.add(4)); 
        System.out.println(driveway.remove(2)); 
        System.out.println(driveway.remove(4)); 
        System.out.println(driveway.add(5)); 
        System.out.println(driveway.add(6)); 
        System.out.println(driveway.remove(1)); 
        System.out.println(driveway.remove(1));
        
        /*
        [Driveway: 1, Street: ]
        [Driveway: 1 2, Street: ]
        [Driveway: 1 2 3, Street: ]
        [That car is already in the driveway.]
        [Driveway: 1 2 3 4, Street: ]
        [Driveway: 1 2 3, Street: 4, Driveway: 1 2, Street: 4 3, Driveway: 1 3, Street: 4, Driveway: 1 3 4, Street: ]
        [Driveway: 1 3, Street: ]
        [Driveway: 1 3 5, Street: ]
        [Driveway: 1 3 5 6, Street: ]
        [Driveway: 1 3 5, Street: 6, Driveway: 1 3, Street: 6 5, Driveway: 1, Street: 6 5 3, Driveway: 3, Street: 6 5, Driveway: 3 5, Street: 6, Driveway: 3 5 6, Street: ]
        [That car is not in the driveway.]
        */
	}
}