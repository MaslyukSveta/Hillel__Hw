public class CarPark {

    private final CarSpecifications[] cars;

    CarPark(CarSpecifications... countedCars) {
        cars = countedCars;
    }

    public int fleetCost() {

        int fleetCost = 0;

        for (CarSpecifications car : cars) {
            fleetCost += car.getPrice();
        }
        return fleetCost;
    }

    public CarSpecifications[] fuelSorting() {

        CarSpecifications[] sorting = cars;

        for (int i = 0; i < sorting.length; i++) {
            double minConsumption = sorting[i].getFuelConsumption();
            CarSpecifications minConsumptionCar = sorting[i];
            int minId = i;
            for (int j = i + 1; j < sorting.length; j++) {
                if (sorting[j].getFuelConsumption() < minConsumption) {
                    minConsumptionCar = sorting[j];
                    minId = j;
                }
            }

            CarSpecifications temp = sorting[i];
            sorting[i] = minConsumptionCar;
            sorting[minId] = temp;
        }
        return sorting;
    }

    public CarSpecifications[] speed(int min, int max) {

        CarSpecifications[] modified = new CarSpecifications[0];

        for (CarSpecifications car : cars) {
            if (car.getMaxSpeed() >= min & car.getMaxSpeed() <= max) {
                modified = array(modified, car);
            }

        }
        return modified;

    }

    private CarSpecifications[] array(CarSpecifications[] initial, CarSpecifications added) {
        CarSpecifications[] modified = new CarSpecifications[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;
    }

    public String toString(CarSpecifications[] speedCars) {
        String report = "";
        for (CarSpecifications car : speedCars) {
            report += car.toString() + "\n";
        }
        return report;

    }

}
