import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CajeroClient {
    private CajeroClient() {}
    
    public static void main(String[] args) {
        String host = "LocalHost"; 
        try {
            Registry registry = LocateRegistry.getRegistry(host, 1099);

            CajeroInterface stub = (CajeroInterface) registry.lookup("CajeroAutomatico");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    System.out.println("Ingrese su NIP");
                    
                    
                } catch (InputMismatchException e) {
                    System.out.println("Este NIP es incorrecto, por favor ingrese uno que sea valido");
                    // TODO: handle exception
                }
            }
            while (true) {
                try {
                    System.out.println("Seleccione la accion que desea realizar: ");
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Depositar saldo");
                    System.out.println("3. Retirar efectivo");

                    switch (operation) {
                        case 1:
                            result = stub.add(a,b);
                            system.out.println("Su saldo es de:" + result);
                            break;
                        case 2:
                            result = stub.add(a,b);
                            System.out.println("Su nuevo saldo es de:" + result);
                            break;
                        case 3:
                            result = stub.add(a,b);
                            system.out.println("Saldo restante:" + result);
                            break;
                    }
                }
            }
        } 
    }
}