public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void bark()
    {
        System.out.println("Woof!");
    }
     void showInfo()
     {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
     }
     public static void main(String[] args) {
        Dog dog = new Dog("Rex", 4);
        dog.showInfo();
        dog.bark();
     }


}
