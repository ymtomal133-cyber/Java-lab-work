import java.util.Scanner;

public class ResultManager {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        // Take input for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter information for Student " + (i + 1));

            System.out.print("ID: ");
            students[i].id = Integer.parseInt(input.nextLine());

            System.out.print("Name: ");
            students[i].name = input.nextLine();

            System.out.print("Marks: ");
            students[i].marks = Double.parseDouble(input.nextLine());
        }

        // Display all students
        System.out.println("\n===== Student Information =====");

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }

        Student topper = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }

        System.out.println("\n===== Top Student =====");
        topper.display();

        double total = 0;

        for (int i = 0; i < students.length; i++) {
            total += students[i].marks;
        }

        double average = total / students.length;

        System.out.printf("%nAverage Marks: %.1f%n", average);

        input.close();
    }
}