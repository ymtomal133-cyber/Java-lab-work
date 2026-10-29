public class StudentManagement {
    public static void main(String[] args) {

        Student student = new Student(101, "Rahim", 85.5);

        student.displayInfo();

        System.out.println();
        System.out.println("Updating student information...");
        System.out.println();

        student.setName("Karim");
        student.setMarks(95.0);

        student.setMarks(120.0);

        System.out.println();

        student.displayInfo();
    }
}