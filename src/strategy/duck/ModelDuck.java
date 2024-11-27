package strategy.duck;

import strategy.duck.fly.FlyNoWay;
import strategy.duck.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("Model Duck!");
    }
}
