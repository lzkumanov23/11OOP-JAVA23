public class Car {
    String brand;
    String model;
    Engine engine;
    Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }
    void showCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        this.engine.showEngineInfo();
    }
}
