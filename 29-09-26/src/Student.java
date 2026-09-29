public class Student {
    String name;
    int age;
    double grade;

    Student (String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    void introduce() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Grade: "+ grade);
    }
    public static void main(String[] args) {
        Student student = new Student("Maria", 16, 5.75);
        Student student2 = new Student("Alex", 17, 5.50);
        student.introduce();
        student2.introduce();
    }
}
