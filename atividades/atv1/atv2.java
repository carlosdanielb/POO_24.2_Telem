import java.util.Scanner;

public class TESTE_01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o primeiro número
        System.out.print(insira primeiro número: ");
        double Num1 = cano.nextDouble();
        
        // Solicita ao usuário que insira o segundo número
        System.out.print("insira segundo número: ");
        double Num2 = cano.nextDouble();
        
        // Solicita ao usuário que insira o terceiro número
        System.out.print("insira terceiro número: ");
        double Num3 = cano.nextDouble();
        
        // Calcula a soma dos três números
        double soma = Num1 + Num2 + Num3;
        
        // Calcula a média aritmética
        double media = soma / 3;
        
        // Exibe o resultado
        System.out.println("A média aritmética dos números " + Num1 + ", " + Num2 + " e " + Num3 + " é: " + media);
        
        // Fecha o scanner
        scanner.close();
    }
}