public class Cabriolet extends CarSpecifications {

    boolean openingRoof;

    Cabriolet(Cabriolet ob) {
        super(ob);
        openingRoof = ob.openingRoof;
    }

    Cabriolet(String b, String m, int p, int max, double f, boolean t) {
        super(b, m, p, max, f);
        openingRoof = t;
    }

    public String toString() {
        return "Cabriolet " + "Brand " + getBrand() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + openingRoof;
    }
}
