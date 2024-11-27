package compound.duck.observer;

// 观察者，感知到变化时会更新状态，Quacklogist实现这个接口
public interface Observer {
    public void update(QuackObservable duck);
}
