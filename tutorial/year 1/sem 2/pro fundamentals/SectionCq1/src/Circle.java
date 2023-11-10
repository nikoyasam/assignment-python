public class Circle {
    private double radius;
    private String color;

    Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = "red";

    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }


}
