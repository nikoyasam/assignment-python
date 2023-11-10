public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee1 = new Employee("John");
        Employee employee2 = new Employee("Jack");

        System.out.println(employee.getName());
        System.out.println(employee1.getName());
        System.out.println(employee2.getName());

        Circle circle = new Circle();
        Circle circle1 = new Circle(2.5,"red");

        System.out.println("circle radius is: " + circle.getRadius() + ", area: " + circle.getArea() + ", color: " + circle.getColor());
        System.out.println("circle1 radius is: " + circle1.getRadius() + ", area: " + circle1.getArea() + ", color: " + circle1.getColor());


        Animal herbivore = new Herbivore();
        Animal carnivore = new Carnivore();
        Animal omnivore = new Omnivore();

        herbivore.eat();
        carnivore.eat();
        omnivore.eat();
    }
}