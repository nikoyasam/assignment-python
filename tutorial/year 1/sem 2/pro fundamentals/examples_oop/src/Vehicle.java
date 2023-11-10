abstract class Vehicle {
    public abstract void power();

}

class ElectricVehicles extends Vehicle{
    public void power(){
        System.out.println("Require electricity");
    }
}

class GasolineVehicles extends Vehicle{
    public void power(){
        System.out.println("Require gasoline");
    }
}

class HybridVehicles extends Vehicle{
    public void power(){
        System.out.println("Require gasoline and and electricity to power engines");
    }
}
