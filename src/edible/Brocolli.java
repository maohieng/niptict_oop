package edible;

public class Brocolli extends Vegetable {

    public Brocolli() {
        super("Brocolli");
    }

    @Override
    public String howToEat() {
        return "cook with salt";
    }
}
