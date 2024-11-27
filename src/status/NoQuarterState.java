package status;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.hasQuarterState);
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