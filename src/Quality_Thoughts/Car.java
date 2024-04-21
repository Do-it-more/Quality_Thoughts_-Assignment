package Quality_Thoughts;

public class Car extends AbstractVehicle {
    private int numDoors;
    public Car(String make, String model, int year, double price, int numDoors) {
        super(make, model, year, price);
        this.numDoors = numDoors;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

