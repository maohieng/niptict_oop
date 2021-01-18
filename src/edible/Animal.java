package edible;

public abstract class Animal {

    private int numLegs;

    public Animal(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return numLegs;
    }
}
