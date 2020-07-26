public class Runner {

    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(1, "Mazda", "CX-5", 2018, "white", 25000, "AX7843AA"),
                new Car(2, "BMW", "X1", 2018, "white", 24000, "AA2849BI"),
                new Car(3, "BMW", "X1", 2017, "black", 23700, "AX2743XA"),
                new Car(4, "Kia", "Sportage", 2020, "white", 20500, "AX3893XP"),
                new Car(5, "Nissan", "Juke", 2019, "white", 17800, "AX2389BI"),
                new Car(6, "Mazda", "CX-5", 2017, "white", 19000, "KA7312AE"),
                new Car(7, "Volkswagen", "Tiguan", 2017, "white", 17200, "AA4934IP"),
                new Car(8, "Mazda", "6", 2018, "red", 18000, "AE9038KX"),
                new Car(9, "Mazda", "CX-3", 2020, "white", 25600, "AX3784UH"),
                new Car(10, "Audi", "A4", 2016, "white", 22950, "AA4389EK")
        };

        CarProcessor proc = new CarProcessor();

        proc.brandSearcher(cars, "Mazda");
        System.out.println();

        proc.ageSearcher(cars, "CX-5", 2);
        System.out.println();

        proc.CostSearcher(cars, 2018, 24000);

    }

}
