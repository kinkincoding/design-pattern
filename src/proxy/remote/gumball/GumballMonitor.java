package proxy.remote.gumball;


public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println(machine.getLocation());
            System.out.println(machine.getCount());
            System.out.println(machine.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
