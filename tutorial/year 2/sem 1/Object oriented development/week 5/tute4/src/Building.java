class Building implements CarbonFootPrint{
    private double squareFootage;

    public Building(double squareFootage){
        this.squareFootage = squareFootage;
    }

    @Override
    public double getCarbonFootPrint(){
        return 50;
    }
}