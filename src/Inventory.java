import java.util.ArrayList;
import java.util.List;

class Inventory {
    private List<Vehicle> vehicles;

    public Inventory() {
        vehicles = new ArrayList<>();
    }

    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Vehicle vehicle : vehicles) {
            totalPrice += vehicle.getPrice();
        }
        return totalPrice;
    }

    public int getTotalVehicles() {
        return vehicles.size();
    }

    public int getTotalCars() {
        int totalCars = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                totalCars++;
            }
        }
        return totalCars;
    }

    public int getTotalMotorbikes() {
        int totalMotorbikes = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Motorbike) {
                totalMotorbikes++;
            }
        }
        return totalMotorbikes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vehicle vehicle : vehicles) {
            sb.append(vehicle.toString()).append("\n");
        }
        sb.append("TOTAL: ").append(getTotalVehicles()).append(" Vehicles including ")
                .append(getTotalCars()).append(" Cars and ")
                .append(getTotalMotorbikes()).append(" Motorbikes having a total price of ")
                .append(getTotalPrice()).append(" TL");
        return sb.toString();
    }
}
