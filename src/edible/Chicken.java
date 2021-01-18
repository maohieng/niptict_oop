package edible;

public class Chicken extends Animal implements Editable {

    public Chicken() {
        super(2);
    }

    @Override
    public String howToEat() {
        return "fry chicken";
    }
}
