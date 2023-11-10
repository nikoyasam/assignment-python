public class City {
    private String name;

    private static int noOfRestaurants;

    City(String name){
        this.name = name;
        noOfRestaurants++;
    }

    public static int getNoOfRestaurants(){
        return noOfRestaurants;
    }

}
