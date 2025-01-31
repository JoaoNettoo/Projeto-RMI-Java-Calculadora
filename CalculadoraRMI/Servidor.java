import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public static void main(String[] args) {
        try {
            // Inicia o registro RMI na porta 1099
            LocateRegistry.createRegistry(1099);

            // Cria a instância da calculadora
            Calculadora calculadora = new CalculadoraImpl();

            // Registra o objeto no RMI Registry
            Naming.rebind("rmi://localhost/Calculadora", calculadora);

            System.out.println("🚀 Servidor RMI rodando...");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
