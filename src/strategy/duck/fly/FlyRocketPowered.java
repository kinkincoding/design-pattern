package strategy.duck.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly rocket powered!");
    }
}
