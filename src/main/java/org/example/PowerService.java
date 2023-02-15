package org.example;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PowerService extends Remote {
    double power(double base, double exponent) throws RemoteException;
}
