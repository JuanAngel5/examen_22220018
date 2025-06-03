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
        } 
    }
}
