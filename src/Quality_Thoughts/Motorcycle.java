package Quality_Thoughts;

public class Motorcycle extends AbstractVehicle {
    private boolean hasSideCar;

    public Motorcycle(String make, String model, int year, double price, boolean hasSideCar) {
        super(make, model, year, price);
        this.hasSideCar = hasSideCar;
    }
    public void displayDetails() {
        super.displayDetails();
        if (hasSideCar) {
            System.out.println("Has Sidecar: Yes");
        } else {
            System.out.println("Has Sidecar: No");
        }
    }
    public void wheelie() {
        System.out.println("Motorcycle is performing a wheelie.");
    }
}
