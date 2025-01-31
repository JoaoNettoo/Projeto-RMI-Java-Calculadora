import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
     public CalculadoraImpl() throws RemoteException {
        super();
    }

    public int soma(int a, int b) throws RemoteException {
        return a + b;
    }

    public int subtrai(int a, int b) throws RemoteException {
        return a - b;
    }

    public int multiplica(int a, int b) throws RemoteException {
        return a * b;
    }

    public int divide(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }
        return a / b;
    }
}
