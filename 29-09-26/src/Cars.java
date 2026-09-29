public class Cars {
    String brand;
    String color;
    int year;

    Cars(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    void showCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    };
    void drive() {
        System.out.println(brand + " is driving");
    }
    public static void main(String[] args) {

    }
    Cars car1 = new Cars("Toyota", "Red", 2024);
    Cars car2 = new Cars("BMW", "Black", 2022);
}
