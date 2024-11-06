import java.util.Scanner;

public class TESTE_01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Verifica se a idade é suficiente para votar
        if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}