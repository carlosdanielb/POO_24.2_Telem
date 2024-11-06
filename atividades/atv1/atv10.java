import java.util.Scanner;

public class TESTE_01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Solicita ao usuário que insira o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        double resultado;
        
        // Realiza a operação com base no operador fornecido
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                // Verifica se o segundo número é diferente de zero para evitar divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                break;
        }
        
        // Fecha o scanner
        scanner.close();
    }
}