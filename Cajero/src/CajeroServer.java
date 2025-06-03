import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CajeroServer implements CajeroInterface{
    public CajeroServer () {}

    @Override
    public double num(double a) throws RemoteException {
        return a; 
    }

    public static void main(String[] args) {
        try {
           CajeroServer obj = new CajeroServer();
           CajeroInterface stub = (CajeroInterface) UnicastRemoteObject.exportObject(obj, 0);
           Registry registry = LocateRegistry.createRegistry(1099);
           registry.rebind("CajeroAutomatico", stub);
           System.out.println("Server is ready");
           
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}