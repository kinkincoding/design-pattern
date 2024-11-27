package proxy.remote.gumball;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(count, args[0]);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// javac -d . src/proxy/remote/gumball/*.java
// 终端1：rmiregistry
// 终端2：java proxy.remote.gumball.GumballMachineTestDrive santafe.mightygumball.com 100
// 终端3：java proxy.remote.gumball.GumballMachineTestDrive boulder.mightygumball.com 200
// 终端4：java proxy.remote.gumball.GumballMachineTestDrive seattle.mightygumball.com 300
// 终端5：java proxy.remote.gumball.GumballMonitorTestDrive
