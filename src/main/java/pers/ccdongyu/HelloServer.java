package pers.ccdongyu;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements Hello{
    protected HelloServer() throws RemoteException {
        super();
    }

    public String say() throws RemoteException {
        return "response from server";
    }

    public static void main(String args[]) throws Exception{
        LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://localhost:1099/hello",new HelloServer());
    }


}

