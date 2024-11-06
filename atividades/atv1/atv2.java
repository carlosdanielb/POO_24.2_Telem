import java.util.Scanner;

public class TESTE_01 {
    public static void main(String[] args) {

        Scanner cano = new Scanner(System.in);
 
        System.out.print(insira primeiro número: ");
        double Num1 = cano.nextDouble();

        System.out.print("insira segundo número: ");
        double Num2 = cano.nextDouble();
 
        System.out.print("insira terceiro número: ");
        double Num3 = cano.nextDouble();
 
        double soma = Num1 + Num2 + Num3;

        double media = soma / 3;

        System.out.println("A média aritmética dos números " + Num1 + ", " + Num2 + " e " + Num3 + " é: " + media);

        scanner.close();
    }
}
