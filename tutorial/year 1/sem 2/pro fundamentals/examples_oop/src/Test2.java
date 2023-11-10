public class Test2 {
    public static void main(String[] args){
        Rectangle_new rectangle_new = new Rectangle_new();
        System.out.println("Area of rectangle 1 is: "+ rectangle_new.getArea());

        Rectangle_new rectangle_new1 = new Rectangle_new(5,10);
        System.out.println("Area of rect2: " + rectangle_new1.getArea()); // Output: 50

        rectangle_new1.setWidth(8);
        System.out.println("New area of rect2: " + rectangle_new1.getArea()); // Output: 40
    }

}
