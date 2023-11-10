public class MovieTest {
    public static void main(String[] args) {
        // We need a Director instance to create a Movie instance
        Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDateOfBirth(String.valueOf(dob));
        director.setNoOfMovies(23);
        System.out.println(director); // Director's toString()
        // Test Movie's constructor and toString()
        Movie movie = new Movie("Avatar", "Fantasy",director);
        System.out.println(movie); // Movie's toString()
        // Test Setters and Getters
        movie.setNumberOfAwards(23);

        System.out.println(movie); // Book's toString()
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory ());
        System.out.println("name of director is: " +
                movie.getDirector().getName());
        System.out.println("surname of director is: " +
                movie.getDirector().getSurname());
        System.out.println("number of awards is " + movie.getNumberOfAwards());
    }
}


