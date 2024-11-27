package factory.pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("pepperoni pizza prepared");
    }
}
