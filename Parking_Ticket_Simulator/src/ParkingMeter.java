public class ParkingMeter {
    private double meterMins;

    public ParkingMeter() {
        meterMins = 0.0;
    }

    public void setMeterPay(double meterMins) {
        this.meterMins = meterMins;
    }

    public double getMeterPay() {
        return meterMins;
    }
}
