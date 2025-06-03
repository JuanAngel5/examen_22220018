import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CajeroInterface extends Remote {
    public double num (double a) throws RemoteException;
    public double num (double b) throws RemoteException;
} 
