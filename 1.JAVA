public class Student {
    String name;
    String city;
    int age;

    // Constructor to initialize the data members
    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    // Method to print the data
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create two objects s1 and s2
        Student s1 = new Student("John Doe", "New York", 20);
        Student s2 = new Student("Jane Doe", "Los Angeles", 22);

        // Print the data for s1
        System.out.println("Student 1:");
        s1.printData();

        // Print the data for s2
        System.out.println("\nStudent 2:");
        s2.printData();
    }
}