package status;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
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
        gumballMachine.count--;
        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.noQuarterState);
        } else {
            gumballMachine.setState(gumballMachine.soldOutState);
        }
    }
}
