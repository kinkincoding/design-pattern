package factory.pizza;

import factory.ingredientFactory.PizzaIngredientFactory;
import factory.ingredientFactory.ingredient.Dough;
import factory.ingredientFactory.ingredient.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    PizzaIngredientFactory ingredientFactory;
    public abstract void prepare();
    public void bake() {
        System.out.println("Baking " + name);
    }
    public void cut() {
        System.out.println("Cutting " + name);
    }
    public void box() {
        System.out.println("Boxing " + name);
    }
}
