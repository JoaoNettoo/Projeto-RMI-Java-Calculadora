import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
    protected CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public int soma(int a, int b) throws RemoteException {
        return a + b;
    }
}
