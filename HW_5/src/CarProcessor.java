public class CarProcessor {

    public void brandSearcher(Car[] cars, String brand) {
        for (Car car : cars) {
            if (car.brand == brand) {
                print(car);
            }
        }
    }

    public void ageSearcher(Car[] cars, String model, int age) {

        for (Car car : cars) {
            int age1 = 2020 - car.year;
            if (car.model == model && age1 > age) {
                print(car);
            }
        }
    }

    public void CostSearcher(Car[] cars, int year, int prise) {
        for (Car car : cars) {
            if (car.year == year && car.price > prise) {
                print(car);
            }
        }
    }

    private void print(Car car) {
        System.out.println("Car id: " +
                car.id + ", brand: " +
                car.brand + ", model: " +
                car.model + ", year of issue: " +
                car.year + ", color: " +
                car.color + ", price: " +
                car.price + ", registration number: " +
                car.number);
    }

}
