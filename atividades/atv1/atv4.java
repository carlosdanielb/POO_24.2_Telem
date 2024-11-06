import java.util.Scanner;

public class TESTE_01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira a primeira idade
        System.out.print("Digite a primeira idade: ");
        int idade1 = cano.nextInt();
        
        // Solicita ao usuário que insira a segunda idade
        System.out.print("Digite a segunda idade: ");
        int idade2 = cano.nextInt();
        
        // Compara as idades e determina qual é a maior ou se são iguais
        if (idade1 > idade2) {
            System.out.println("A primeira idade (" + idade1 + ") é maior que a segunda idade (" + idade2 + ").");
        } else if (idade1 < idade2) {
            System.out.println("A segunda idade (" + idade2 + ") é maior que a primeira idade (" + idade1 + ").");
        } else {
            System.out.println("As idades são iguais.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}