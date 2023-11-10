public class Rectangle_new {
    private double length;
    private double width;

    public Rectangle_new(){
        this.length = 0;
        this.width = 0;
    }
    public Rectangle_new(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length * width;

    }
}
