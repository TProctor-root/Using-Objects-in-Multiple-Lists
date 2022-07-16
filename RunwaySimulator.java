import java.util.LinkedList;
import java.util.Queue;

class RunwaySimulator {
    private Queue<String> takingOff; 
    private Queue<String> landing; 
    
    public RunwaySimulator() {
    	landing = new LinkedList<>();
        takingOff = new LinkedList<>();
    } 
    public void addTakeOff(String flightSymbol) {
        takingOff.add(flightSymbol);
    } 
    public void addLanding(String flightSymbol) {
        landing.add(flightSymbol);
    }
    public String handleNextAction() {
        String a = "";
        if(!landing.isEmpty()) {
            a = landing.remove() + " landing";
        }
        else if(!takingOff.isEmpty()) {
            a = takingOff.remove() + " taking off";
        }
        return a;
    }
}