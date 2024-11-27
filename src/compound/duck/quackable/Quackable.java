package compound.duck.quackable;

import compound.duck.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
