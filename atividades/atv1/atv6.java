import java.util.Scanner;

public class TESTE_01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o preço original
        System.out.print("Digite o preço original: R$ ");
        double preçoOrginali = cano.nextDouble();
        
        // Solicita ao usuário que insira o percentual de desconto
        System.out.print("Digite o percentual de desconto (ex: 15 para 15%): ");
        double percentualDesconto = cano.nextDouble();
        
        // Calcula o valor do desconto
        double valorDesconto = preçoOriginal * (percentualDesconto / 100);
        
        // Calcula o preço final após o desconto
        double preçoFinal = preçoOriginal - valorDesconto;
        
        // Exibe o resultado
        System.out.printf("O preço final após um desconto de %.2f%% é: R$ %.2f%n", percentualDesconto, precoFinal);
        
        // Fecha o scanner
        scanner.close();
    }
}