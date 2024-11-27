package factory.ingredientFactory;

import factory.ingredientFactory.ingredient.Dough;
import factory.ingredientFactory.ingredient.MarinaraSauce;
import factory.ingredientFactory.ingredient.Sauce;
import factory.ingredientFactory.ingredient.ThinCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
