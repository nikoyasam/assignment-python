public class Test3 {
    public static void main(String[] args){
        Vehicle electricVehicles = new ElectricVehicles();
        Vehicle gasolineVehicles = new GasolineVehicles();
        Vehicle hybridVehicles = new HybridVehicles();

        electricVehicles.power();
        gasolineVehicles.power();
        hybridVehicles.power();
    }
}
