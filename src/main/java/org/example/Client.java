package org.example;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            PowerService service = (PowerService) Naming.lookup("rmi://localhost/PowerService");
            double result = service.power(2, 3);
            System.out.println("El resultado de la operacion es: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
