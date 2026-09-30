public class Student {
    String name;
    static String school = "IB School";
    Student(String name) {
        this.name = name;
    }
    void showInfo() {
        System.out.println("Name : " + name);
        System.out.println("School : " + school);
    }
}
