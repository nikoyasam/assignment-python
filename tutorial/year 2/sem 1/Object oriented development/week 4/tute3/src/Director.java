import java.text.SimpleDateFormat;
import java.util.Date;
public class Director {
    private String name;
    private String surname;
    private static int noOfMovies;
    private String dateOfBirth;

    public Director(String name,String surname){
        this.name = name;
        this.surname = surname;
        this.noOfMovies++; // The initial number of movies directed is set to 0.

    }

    public static void setNoOfMovies(int noOfMovies) {
        Director.noOfMovies = noOfMovies;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }



    public int getNumberOfMovies() {
        return noOfMovies;
    }

    // Public setter for Date of Birth
    public void setDateOfBirth(Date dateOfBirth)  {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = (String.valueOf(dateOfBirth));
    }

    public static int getNoOfMovies(){
        return noOfMovies;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Director [name = " + name + ", surname = " + surname + ", dob = " + dateOfBirth + ", movies directed = " + noOfMovies + "]";
    }
}

