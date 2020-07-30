class CarSpecifications {

    private final String brand;
    private final String model;
    private final int price;
    private final int maximumSpeed;
    private final double fuelConsumption;

    CarSpecifications(CarSpecifications ob) {

        brand = ob.brand;
        model = ob.model;
        price = ob.price;
        maximumSpeed = ob.maximumSpeed;
        fuelConsumption = ob.fuelConsumption;
    }

    CarSpecifications(String b, String m, int p, int max, double f) {

        brand = b;
        model = m;
        price = p;
        maximumSpeed = max;
        fuelConsumption = f;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maximumSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String toString() {
        return "Brand " + brand + ", model " + model + ", price" + price + ", maximum speed" +
                maximumSpeed + ", fuel consumption" + fuelConsumption;
    }

}

