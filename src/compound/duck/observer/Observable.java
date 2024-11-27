package compound.duck.observer;


import java.util.ArrayList;
import java.util.Iterator;

// 所有鸭子类中都有这个对象，当鸭子类调用QuackObservable中的方法时，实际上会调用这个对象的方法
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    // 注册观察者
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // 通知观察者
    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
