public class MiniBus extends CarSpecifications {

    int numberOfSeats;

    MiniBus(MiniBus ob) {
        super(ob);
        numberOfSeats = ob.numberOfSeats;
    }

    MiniBus(String b, String m, int p, int max, double f, int i) {
        super(b, m, p, max, f);
        numberOfSeats = i;
    }

    public String toString() {
        return "Mini bus " + "Brand " + getBrand() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + numberOfSeats;
    }

}
