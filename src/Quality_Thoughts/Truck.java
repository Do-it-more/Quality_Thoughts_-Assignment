package Quality_Thoughts;

public class Truck extends AbstractVehicle {
    private double towingCapacity;

    public Truck(String make, String model, int year, double price, double towingCapacity) {
        super(make, model, year, price);
        this.towingCapacity = towingCapacity;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Towing Capacity: " + towingCapacity + " lbs");
    }
    public void tow() {
        System.out.println("Truck is towing.");
    }
}

