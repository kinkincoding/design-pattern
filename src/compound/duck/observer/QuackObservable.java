package compound.duck.observer;

// 所有鸭子类都需要实现该接口，因此Quackable实现了该接口
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
