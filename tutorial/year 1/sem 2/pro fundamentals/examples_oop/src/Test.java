public class Test {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setSalary(90000);
        System.out.println("Employees salary is: "+ employee.getSalary());

        Circle circle = new Circle();
        circle.setRadius(8.9);
        System.out.println("Radius is: " + circle.getRadius());

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(9.9);
        rectangle.setLength(18.9);

        System.out.println("The length of rectangle is " + rectangle.getWidth() + ",The width of the rectangle is " + rectangle.getLength());

    }
}
