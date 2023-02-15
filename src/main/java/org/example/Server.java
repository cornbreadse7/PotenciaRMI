package org.example;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            PowerService service = new PowerServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("PowerService", service);
            System.out.println("El servidor esta corriendo...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
