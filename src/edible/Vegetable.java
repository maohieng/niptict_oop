package edible;

public abstract class Vegetable implements Editable {
    private String name;

    public Vegetable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
