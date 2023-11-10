import java.util.List;

public class Restaurant {
    private String address;
    private String name;
    private static int noOfDishes = 0;

    Restaurant(String address, String name){
        this.address = address;
        this.name = name;
        noOfDishes++;
    }

    public static int getNoOfDishes(){
        return noOfDishes;
    }

}


