public class Rectangle {
    private double length;
    private double width;

    // Default constructor inserted by the compiler
    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length  >= 0.5 && length <= 200)
            this.length = length;
        else{
            System.out.println("Invalid value please enter a value between 0.5 and 200");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0.5 && length <= 200)
            this.width = width;
        else{
            System.out.println("Invalid value please enter a value between 0.5 and 200");
        }
    }
}

