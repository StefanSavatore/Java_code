package com.damon.simpleRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    String sayHello(String someOne) throws RemoteException;
}
