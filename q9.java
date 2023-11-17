import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "NA";
    }
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studs = new Student[10];
        for (int i = 0; i < studs.length; i++) {
            studs[i] = new Student();
        }
        for (int i = 0; i < studs.length; i++) {
            studs[i] = new Student();
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter address: ");
            String address = sc.nextLine();
            studs[i].setInfo(name, age, address);
        }
        System.out.println("\nStudent Information:");
        for (Student st : studs) {
            st.displayInfo();
        }
    }
}
