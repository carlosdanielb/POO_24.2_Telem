import java.util.Scanner;

public class TESTE_01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira a primeira idade
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = cano.nextInt();
        
        // Solicita ao usuário que insira a segunda idade
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = cano.nextInt();
        
        // Verifica se ambas as idades são maiores ou iguais a 18
        if (idade1 >= 18 && idade2 >= 18) {
            System.out.println("Ambas as pessoas são maiores de idade.");
        } else {
            System.out.println("Pelo menos uma das pessoas não é maior de idade.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}