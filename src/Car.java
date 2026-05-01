public class Car extends Vehicle{


    private double weigh;

    public Car() {
    }

    public Car(long id, String brand, String model, double weigh) {
        super(id, brand, model);
        this.weigh = weigh;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    
}
