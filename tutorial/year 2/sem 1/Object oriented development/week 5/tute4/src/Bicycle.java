class Bicycle implements CarbonFootPrint {
    private boolean isElectric;

    public Bicycle(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public double getCarbonFootPrint() {
        // Calculate carbon footprint for a bicycle
        // Bicycles have a very low carbon footprint, so we'll return a constant small value
        return 0.1; // Arbitrary value for demonstration purposes
    }
}
