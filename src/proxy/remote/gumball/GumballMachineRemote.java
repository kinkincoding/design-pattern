package proxy.remote.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    String sayHello() throws RemoteException;
    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
    int getCount() throws RemoteException;
}
