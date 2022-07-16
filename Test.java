import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Test {
    private final double EPSILON = 1e-13;
    Main tester = new Main();

    @Test
    public void test1() {
        assertEquals(1, tester.problem1_count8s(8), EPSILON);

    }

    @Test
    public void test2() {
        assertEquals(2, tester.problem1_count8s(818), EPSILON);

    }

    @Test
    public void test3() {
        assertEquals(4, tester.problem1_count8s(8188), EPSILON);

    }

    @Test
    public void test4() {
        assertEquals(7, tester.problem1_count8s(81888098), EPSILON);

    }

    @Test
    public void test5() {
        assertEquals(true, tester.problem2_arrayTimesTen(new int[] { 1, 2, 20 }, 0));

    }

    @Test
    public void test6() {
        assertEquals(true, tester.problem2_arrayTimesTen(new int[] { 3, 30, 0 }, 0));

    }

    @Test
    public void test7() {
        assertEquals(false, tester.problem2_arrayTimesTen(new int[] { 3 }, 0));

    }

    @Test
    public void test8() {
        assertEquals("h*e*l*l*o", tester.problem3_addStars("hello"));

    }

    @Test
    public void test9() {
        assertEquals("a*b*c", tester.problem3_addStars("abc"));

    }

    @Test
    public void test10() {
        assertEquals("a*b", tester.problem3_addStars("ab"));

    }

    @Test
    public void test11() {
        assertEquals("h", tester.problem3_addStars("h"));

    }

    @Test
    public void test12() {
        Roster roster = new Roster();
        roster.addPerson(3, "Robert");
        roster.addPerson(5, "Adriana");
        roster.addPerson(188, "Rujun");
        roster.addPerson(9, "Anupriya");
        roster.addPerson(45, "Yizhen");
        roster.addPerson(88, "Emily");
        assertEquals("Adriana Anupriya Emily Robert Rujun Yizhen", roster.getNamesInAlphaOrder());
        assertEquals("Anupriya", roster.findPerson(9).getName());
        assertEquals(45, roster.findPerson("Yizhen").getId());
        roster.removePerson(3);
        roster.removePerson("Emily");
        assertEquals("Adriana Anupriya Rujun Yizhen", roster.getNamesInAlphaOrder());
    }

    @Test
    public void test13() {
        Driveway driveway = new Driveway();
        ArrayList<String> test = new ArrayList<>();
        test.add("Driveway: 1");
        test.add("Street: ");
        assertEquals(test, driveway.add(1));
        assertEquals(Arrays.asList("Driveway: 1 2", "Street: "), driveway.add(2));
        assertEquals(Arrays.asList("Driveway: 1 2 3", "Street: "), driveway.add(3));
        assertEquals(Arrays.asList("That car is already in the driveway."), driveway.add(3));
        assertEquals(Arrays.asList("Driveway: 1 2 3 4", "Street: "), driveway.add(4));
        assertEquals(Arrays.asList("Driveway: 1 2 3", "Street: 4", "Driveway: 1 2", "Street: 4 3", "Driveway: 1 3",
                "Street: 4", "Driveway: 1 3 4", "Street: "), driveway.remove(2));
        assertEquals(Arrays.asList("Driveway: 1 3", "Street: "), driveway.remove(4));
        assertEquals(Arrays.asList("Driveway: 1 3 5", "Street: "), driveway.add(5));
        assertEquals(Arrays.asList("Driveway: 1 3 5 6", "Street: "), driveway.add(6));
        assertEquals(Arrays.asList("Driveway: 1 3 5", "Street: 6", "Driveway: 1 3", "Street: 6 5", "Driveway: 1",
                "Street: 6 5 3", "Driveway: 3", "Street: 6 5", "Driveway: 3 5", "Street: 6", "Driveway: 3 5 6",
                "Street: "), driveway.remove(1));
        assertEquals(Arrays.asList("That car is not in the driveway."), driveway.remove(1));
    }

    @Test
    public void test14() {
        ToDoList todo = new ToDoList();
        todo.addTask(2, "read book");
        todo.addTask(3, "wash dishes");
        todo.addTask(5, "eat lunch");
        assertEquals("read book", todo.nextTask().getDescription());
        todo.addTask(1, "walk dog");
        assertEquals("walk dog", todo.nextTask().getDescription());
        assertEquals("wash dishes", todo.nextTask().getDescription());
        assertEquals("eat lunch", todo.nextTask().getDescription());
    }

    @Test
    public void test15() {
        RunwaySimulator rws = new RunwaySimulator();
        rws.addTakeOff("FlightA");
        rws.addTakeOff("FlightB");
        rws.addLanding("FlightC");
        rws.addLanding("FlightD");
        assertEquals("FlightC landing", rws.handleNextAction());
        assertEquals("FlightD landing", rws.handleNextAction());
        assertEquals("FlightA taking off", rws.handleNextAction());
        rws.addLanding("FlightE");
        assertEquals("FlightE landing", rws.handleNextAction());
        assertEquals("FlightB taking off", rws.handleNextAction());
    }

    @Test
    public void test16() {
        Gradebook gb = new Gradebook();
        gb.addEntry("Robert", "A+");
        gb.addEntry("Emily", "B");
        gb.addEntry("Max", "D");
        assertArrayEquals(new String[] { "Emily B", "Max D", "Robert A+" }, gb.getEntries());
        gb.modifyEntry("Max", "C");
        gb.removeEntry("Emily");
        assertArrayEquals(new String[] { "Max C", "Robert A+" }, gb.getEntries());

    }

}