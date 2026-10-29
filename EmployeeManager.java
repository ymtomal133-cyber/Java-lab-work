class Employee {
    void work() {
        System.out.println("Employe is working");
    }
}

class Manager extends Employee{
    @Override 
    void work() {
        System.out.println("Manager is working");
    }
}

class Developer extends Employee{
    @Override 
    void work() {
        System.out.println("Developer is working");
    }
}

public class EmployeeManager {
    public static void main(String[] args) {

        Employee emp = new Manager();
        emp.work();
        emp = new Developer();
        emp.work();
    }

}