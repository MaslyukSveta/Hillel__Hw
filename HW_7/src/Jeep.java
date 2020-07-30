public class Jeep extends CarSpecifications {

    double clearance;

    Jeep(Jeep ob) {
        super(ob);
        clearance = ob.clearance;
    }

    Jeep(String b, String m, int p, int max, double f, double cl) {
        super(b, m, p, max, f);
        clearance = cl;
    }

    public String toString() {
        return "Jeep " + "Brand " + getBrand() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + clearance;
    }

}
