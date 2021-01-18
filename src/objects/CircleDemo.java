package objects;

public class CircleDemo {
    public static void main(String[] args) {
//        Circle circle1 = new Circle(); // Object circle1 in memory with radius = 1
//        Circle circle2 = new Circle(3.5);

        Circle[] circles = new Circle[10]; // initialize an array of length=5 in memory

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1);
        }

        for (int i = 0; i < circles.length; i++) {
            System.out.println("Circle index: " + i);
            printCircle(circles[i]);
            System.out.println();
        }

//        printCircle(circle1);
//        System.out.println();
//        printCircle(circle2);


    }

    public static void printCircle(Circle circle) {
        System.out.println("Circle radius " + circle.getRadius() + " has:");
        System.out.println("--> Perimeter: " + circle.getPerimeter());
        System.out.println("--> Area: " + circle.getArea());
    }
}
