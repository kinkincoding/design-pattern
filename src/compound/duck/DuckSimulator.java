package compound.duck;

import compound.duck.quackable.*;
import compound.duck.factory.AbstractDuckFactory;
import compound.duck.factory.CountingDuckFactory;
import compound.duck.observer.Quacklogist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate(new CountingDuckFactory());
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        // Flock 组合模式：和叶子节点实现同样的接口 + 迭代器模式
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);

        // 观察者模式
        // Quacklogist是观察者，实现了Observer接口
        // Quackable是被观测对象，实现了Observable接口
        // 观察者被注册未被观测对象的成员变量，被观测对象发生变化时可以更新观察者
        Quacklogist quacklogist = new Quacklogist();
        flockOfDucks.registerObserver(quacklogist);

        // AbstractDuckFactory 抽象工厂：创建多态的方法，通过传入不同的工厂得到不同的产品家族
        Quackable duckCall = duckFactory.createDuckCall();
        // QuackCounter 装饰模式：增加行为
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        // GooseAdapter 适配器模式：接口转换
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator");

        simulate(flockOfDucks);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
