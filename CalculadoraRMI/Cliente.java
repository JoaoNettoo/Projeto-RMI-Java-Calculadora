import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Localiza o serviço remoto
            Calculadora calculadora = (Calculadora) Naming.lookup("rmi://localhost/Calculadora");

            // Testa a operação de soma
            int resultado = calculadora.soma(5, 3);
            System.out.println("🖩 Resultado da soma: " + resultado);
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
