public class DirectorTest {
    public static void main(String[] args) {
// Test constructor
        Director director = new Director("James", "Cameron");
// Test Setters and Getters
// Crete an object Date to represent the dob
        Date dob = new Date(16, 8, 1954);
        director.setDateOfBirth(String.valueOf(dob));
        director.setNoOfMovies(23);
        System.out.println(director); // toString()
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurname());
        System.out.println("dob is: " + director.getDateOfBirth());
        System.out.println("number of directed movies is: " +
                director.getNumberOfMovies());
    }
}