public class Student {

    private String name;
    private int id;
    static String uni = "Aiub";
    private static String dept;
    private static int count;

    // Static block to initialize static variables
    static {
        System.out.println("Static Block !");
        count = 3;
    }

    // Default constructor
    public Student() {
        System.out.println("Default Constructor calling ");
        count++;
    }

    // Parameterized constructor
    public Student(String name, int id) {
        System.out.println("Parameterized Constructor calling ");
        this.name = name;
        this.id = id;
        count++;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    // Display method to print the student's details
    void Display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University: " + uni);
        System.out.println("Department: " + dept_initialize());
        System.out.println("Total count: " + count);
    }

    // Static method to initialize the department
    static String dept_initialize() {
        dept = "CSE";
        return dept;
    }
}
