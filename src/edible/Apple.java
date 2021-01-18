package edible;

public class Apple extends Fruit {

    public Apple() {
        super("Apple");
    }

    @Override
    public String howToEat() {
        return "make apple juice";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
