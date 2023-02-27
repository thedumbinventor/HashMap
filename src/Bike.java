class Bike implements Vehicle {
    private double speed;

    public double getSpeed() {
        return speed * 2.0;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}