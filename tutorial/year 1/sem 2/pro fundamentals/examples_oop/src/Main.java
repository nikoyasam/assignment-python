public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2021);
        System.out.println(car.getMake());  // Output: "Toyota"
        System.out.println(car.getModel());  // Output: "Camry"
        System.out.println(car.getYear());  // Output: 2021
        System.out.println("");
        Book book = new Book("The clouds","Nikoya",500);
        book.setTitle("No clouds");
        book.setNoOfPages(100);

        Book book1 = new Book();

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNoOfPages());


        System.out.println("");
        book1.setNoOfPages(80);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getNoOfPages());


    }
}