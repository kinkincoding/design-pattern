package adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        duck.quack();
        duck.fly();

        turkey.gobble();
        turkey.fly();

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
