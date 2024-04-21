package Quality_Thoughts;

public class Task3Abstract {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 25000.0, 4);
        Truck truck = new Truck("Ford", "F-150", 2023, 35000.0, 12000.0);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, 12000.0, false);
        System.out.println("--- Car Details ---");
        car.displayDetails();
        car.accelerate();
        System.out.println();
        System.out.println("--- Truck Details ---");
        truck.displayDetails();
        truck.tow();
        System.out.println();
        System.out.println("--- Motorcycle Details ---");
        motorcycle.displayDetails();
        motorcycle.wheelie();
    }
}
