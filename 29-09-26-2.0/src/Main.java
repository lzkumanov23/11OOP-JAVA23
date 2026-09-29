public class Main
{
    public static void main(String[] args)
    {
        Engine engine = new Engine("Petrol", 150);
        Car car = new Car("Toyota","Corolla", engine);

        car.showCarInfo();
    }
        }

