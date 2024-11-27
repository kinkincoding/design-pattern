package factory.store;

import factory.ingredientFactory.ChicagoPizzaIngredientFactory;
import factory.ingredientFactory.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        }
        return new ClamPizza();
    }
}
