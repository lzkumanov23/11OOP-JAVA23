public class Employee {
    String name;
    double salary;
    Department department;

    Employee(String name, double salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    void showInfo() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }

}
