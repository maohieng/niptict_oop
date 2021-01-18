package edible;

public abstract class Fruit implements Editable {

    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
