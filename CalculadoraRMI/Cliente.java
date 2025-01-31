import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Conecta ao servidor RMI
            Calculadora c = (Calculadora) Naming.lookup("rmi://localhost/Calculadora");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha uma operação: soma, subtrai, multiplica, divide");
            String operacao = scanner.nextLine();

            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = 0;
            switch (operacao.toLowerCase()) {
                case "soma":
                    resultado = c.soma(num1, num2);
                    break;
                case "subtrai":
                    resultado = c.subtrai(num1, num2);
                    break;
                case "multiplica":
                    resultado = c.multiplica(num1, num2);
                    break;
                case "divide":
                    try {
                        resultado = c.divide(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }

            System.out.println("Resultado: " + resultado);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
