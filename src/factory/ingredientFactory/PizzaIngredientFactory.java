package factory.ingredientFactory;

import factory.ingredientFactory.ingredient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
}
