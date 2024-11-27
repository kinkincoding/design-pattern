package factory.store;

import factory.ingredientFactory.NYPizzaIngredientFactory;
import factory.ingredientFactory.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        }
        return new ClamPizza();
    }
}
