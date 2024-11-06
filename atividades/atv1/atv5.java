import java.util.Scanner;

public class TESTE_01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número está entre 10 e 20, inclusive
        if (numero >= 10 && numero <= 20) {
            System.out.println("O número " + numero + " está entre 10 e 20.");
        } else {
            System.out.println("O número " + numero + " não está entre 10 e 20.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}