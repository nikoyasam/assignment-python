import java.util.Objects;

public class Cylinder {
    private double radius;
    private double height;

    private static int numCylinders = 0;

    public Cylinder(){
        this.radius = 2;
        this.height = 5;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        numCylinders++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius value. Radius must be greater than 0.");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height value. Height must be greater than 0.");
        }
    }

    public static int getNumCylinders() {
        return numCylinders;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + radius + ",height=" + height + "]";
    }

    // Additional Challenge 02: Override the equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cylinder other = (Cylinder) obj;
        return this.radius == other.radius && this.height == other.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, height);
    }



}
