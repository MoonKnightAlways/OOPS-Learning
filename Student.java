class Student {
    int id;
    String name;
    int age;

    // 0-arg constructor
    Student() {
        this(20, "Saksham", 19);
        System.out.println("Inside 0-args constructor");
    }

    // 1-arg constructor
    Student(int i) {
        id = i;
        name = "NULL";
        age = 0;
    }

    // 2-arg constructor
    Student(int i, String n) {
        this(i);
        name = n;
        System.out.println("Inside 2-args constructor");
    }

    // 3-arg constructor
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
        System.out.println("Inside 3-args constructor");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(102, "Rahul");
        Student s3 = new Student(103, "Aman", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}
