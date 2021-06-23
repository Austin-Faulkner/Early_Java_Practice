public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private double minsParked;

    public ParkedCar() {
        make = " ";
        model = " ";
        color = " ";
        minsParked = 0.0;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) { this.color = color; }

    public void setMinsParked(double minsParked) { this.minsParked = minsParked; }

    public String getMake() { return make; }

    public String getModel() { return model; }

    public String getColor() {
        return color;
    }

    public double getMinsParked() { return minsParked; }
}
