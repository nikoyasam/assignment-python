class Car implements CarbonFootPrint {
    private double fuelEfficiency;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
    @Override
    public double getCarbonFootPrint() {
        return 5;
    }
}
