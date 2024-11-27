package status;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("unsupported");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("unsupported");
    }

    @Override
    public void turnCrank() {
        System.out.println("unsupported");
    }

    @Override
    public void dispense() {
        System.out.println("unsupported");
    }
}
