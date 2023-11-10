public class Movie {
    private String title;
    private String category;
    private Director director;

    private static int numberOfAwards;
    private String dateOfBirth;

    Movie(String title, String category,Director director){
        this.title = title;
        this.category = category;
        this.director = director;
        this.numberOfAwards++;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (isValidDate(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println("Invalid date format. Please use 'dd/mm/yyyy' format.");
        }
    }

    public static void setNumberOfAwards(int numberOfAwards) {
        Movie.numberOfAwards = numberOfAwards;
    }


    public int getNumberOfAwards(){
        return numberOfAwards;
    }

    public String toString(){
        return "Director [title = " + title + ", category = " + category + ", director name = " + director + ", number of awards = " + numberOfAwards + "]";
    }

    private boolean isValidDate(String date) {
        String[] dateParts = date.split("/");
        if (dateParts.length == 3) {
            try {
                int day = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);

                if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1900) {
                    return true;
                }
            } catch (NumberFormatException e) {
                // Invalid integer format
            }
        }
        return false;
    }


}

