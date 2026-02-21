import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=================================");
            System.out.println("   Student Management System");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Update Student by ID");
            System.out.println("6. Exit");
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
                    updateStudent();
                    break;
                case 6:
                    System.out.println("\nExiting program. Goodbye!");
                    return;
                default:
                    System.out.println("\nInvalid choice. Try again.");
            }
        }
    }

    public static void addStudent() {
        System.out.println("\n--- Add Student ---");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        students.add(new Student(id, name, age));

        System.out.println("\nStudent added successfully!\n");
    }

    public static void viewStudents() {
        System.out.println("\n--- Student List ---");

        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
            System.out.println("-----------------------------");
        }
    }

    public static void searchStudent() {
        System.out.println("\n--- Search Student ---");
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getID() == id) {
                System.out.println("\nStudent Found:");
                System.out.println(s + "\n");
                return;
            }
        }

        System.out.println("\nStudent not found.\n");
    }

    public static void deleteStudent() {
        System.out.println("\n--- Delete Student ---");
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getID() == id) {
                students.remove(s);
                System.out.println("\nStudent deleted successfully.\n");
                return;
            }
        }

        System.out.println("\nStudent not found.\n");
    }

    public static void updateStudent() {
        System.out.println("\n--- Update Student ---");
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {

                System.out.print("Enter new Name: ");
                String newName = sc.nextLine();

                System.out.print("Enter new Age: ");
                int newAge = sc.nextInt();

                
                students.remove(s);
                students.add(new Student(id, newName, newAge));

                System.out.println("\nStudent updated successfully.\n");
                return;
            }
        }

        System.out.println("\nStudent not found.\n");
    }
}
