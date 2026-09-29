public class Department {
    String name;
    String location;
    Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void showDepartmentInfo() {
        System.out.println("Department: " + name);
        System.out.println("Location: " + location);
    }
}
