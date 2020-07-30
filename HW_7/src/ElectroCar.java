public class ElectroCar extends CarSpecifications {

    int maximumMileageFromOneCharge;

    ElectroCar(ElectroCar ob) {
        super(ob);
        maximumMileageFromOneCharge = ob.maximumMileageFromOneCharge;
    }

    ElectroCar(String b, String m, int p, int max, double f, int o) {
        super(b, m, p, max, f);
        maximumMileageFromOneCharge = o;
    }

    public String toString() {
        return "Electro car " + "Brand " + getBrand() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + maximumMileageFromOneCharge;
    }
}
