public class Sedan extends CarSpecifications {

    String comfortClass;

    Sedan(Sedan ob) {
        super(ob);
        comfortClass = ob.comfortClass;
    }

    Sedan(String b, String m, int p, int max, double f, String c) {
        super(b, m, p, max, f);
        comfortClass = c;
    }

    public String toString() {
        return "Sedan " + "Brand " + getBrand() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + comfortClass;
    }
}
