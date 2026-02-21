import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n******************");
            System.out.println("Student Management System");
            System.out.println("******************");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void addStudent() {
        System.out.println("\n---Add Student---");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        students.add(new Student(id, name, age));
        System.out.println("Student added successfully.");
    }

    public static void viewStudents() {
        System.out.println("\n---Student List---");
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void searchStudent() {
        System.out.println("\n---Search Student---");
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("\nStudent found:");
                System.out.println(s+ "\n");
                return;
            }
        }

        System.out.println("\nStudent not found.\n");
    }

    public static void deleteStudent() {
        System.out.println("\n---Delete Student---");
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getID() == id) {
                students.remove(s);
                System.out.println("\nStudent deleted.\n");
                return;
            }
        }

        System.out.println("\nStudent not found.\n");
    }
}
