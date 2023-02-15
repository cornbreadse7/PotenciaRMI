package org.example;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class PowerServiceImpl extends UnicastRemoteObject implements PowerService {

    protected PowerServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public double power(double base, double exponent) throws RemoteException {
        return Math.pow(base, exponent);
    }
}

