import java.util.*;

class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x != other.x) {
            return Double.compare(this.x, other.x);//first checks if the x coordinates of the two points
            // are different If they are, it compares them using Double.compare.
        } else {
            return Double.compare(this.y, other.y);
            //If the x coordinates are the same, it compares the y coordinates. This ensures that
            // points are sorted first by x coordinate and then by y coordinate.
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getY() != p2.getY()) {
            return Double.compare(p1.getY(), p2.getY());
        } else {
            return Double.compare(p1.getX(), p2.getX());
        }
    }
}

