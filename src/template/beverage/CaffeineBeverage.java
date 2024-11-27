package template.beverage;

public abstract class CaffeineBeverage {
    final public void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    boolean customerWantsCondiments() {
        return true;
    }
    void boilWater() {
    }
    void pourInCup() {
    }
}
