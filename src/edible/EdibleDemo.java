package edible;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EdibleDemo {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Mango();

        Vegetable veg = new Brocolli();

        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Dog();

        List<Editable> editables = new ArrayList<>();
        editables.add(fruits[0]);
        editables.add(fruits[1]);
        editables.add(veg);
        editables.add((Editable) animals[0]);

        for (Editable editable : editables) {
            System.out.println("We eat " + editable.getClass().getSimpleName()
                    + " by " + editable.howToEat());
        }
    }
}
