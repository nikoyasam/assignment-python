import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortPointsInPlane {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        // Randomly create 100 points
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            double x = random.nextDouble() * 100; // Adjust the range as needed
            double y = random.nextDouble() * 100; // Adjust the range as needed
            points.add(new Point(x, y));
        }

        // Sort the points by x-coordinates
        Collections.sort(points);

        System.out.println("Points sorted by x-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }

        // Sort the points by y-coordinates
        Collections.sort(points, new CompareY());

        System.out.println("\nPoints sorted by y-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
