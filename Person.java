class Person implements Comparable<Person>{
    private int a;
    private String b;
    
    public Person(int id, String name) {
        a = id;
        b = name;
    }
    public String getName() {
        return b;
    } 
    public int getId() {
        return a;
    }
    public int compareTo(Person otherObject) {
        return b.compareTo(otherObject.b);
    }
}