import java.util.Objects;

public class Truck extends Vehicle{
    private double loadCap;
    private int towCap;

    public Truck(String make, String model, double emissionsPerMile, double loadCap, int towCap) {
        super(make, model, emissionsPerMile);
        this.loadCap = loadCap;
        this.towCap = towCap;
    }

    public double getLoadCap() {
        return loadCap;
    }

    public void setLoadCap(double loadCap) {
        this.loadCap = loadCap;
    }

    public int getTowCap() {
        return towCap;
    }

    public void setTowCap(int towCap) {
        this.towCap = towCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.loadCap, loadCap) == 0 &&
                towCap == truck.towCap;
    }

    @Override
    public void checkEmissionsData(double miles, double emissions) {
        double legalVal = miles/emissions;
        if(legalVal < 0.4){
            super.setStreetLegal("not street legal");
        } else{
            super.setStreetLegal("street legal");

        }
    }
//
//    @Override
//    public String toString() {
//        return "Truck{" +
//                "loadCap=" + loadCap +
//                ", towCap=" + towCap +
//                '}';
//    }
}
