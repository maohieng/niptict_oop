package objects;

/**
 * Circle is an immutable class
 */
public class Circle {
    // Properties

    private double radius; // default value = 0.0

    // initialize fields with block
    {
        radius = 1;
    }

    // Constants
    static final double PI = Math.PI;

    // default constructor
    public Circle() {
        this(1);
    }

    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods
    // Non-static methods or instance methods

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    // Getters method
    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                '}';
    }
}
