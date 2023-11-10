import java.util.Date;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String employer;
    private static int noOfFavRestaurants;
    private String city;

    Customer(String firstName, String lastName, Date birthDate,String employer,String city ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.employer = employer;
        this.city = city;
        noOfFavRestaurants++;

    }

    public static int getNoOfFavRestaurants(){
        return noOfFavRestaurants;
    }



}

