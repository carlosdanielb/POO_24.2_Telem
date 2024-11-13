package teste;
public class Teste_01 {
public static void main(String[] args) {
int[] num = {0,1,2,3,4};
System.out.println(num[0]);
num[0] = 5;
String[] bah = {"Segunda", "terça", "quarta", "quinta", "sexta"};
//System.out.println(bah);
for (int i = 0; i <= 4; i++) {
	System.out.println(i + " " + bah[i]);
}
    
}
}

//Referente á aula do dia 13/11/2024

package teste;
import java.util.Scanner;
	public class HelloWorld{
		public static void main(String [] args) {
			Scanner myObj = new Scanner(System.in);
			String[] bah = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
			System.out.println("Escolha um número de 0 a 6 ");
			for (int i = 0; i < bah.length; i++) {
				System.out.println("Próximo dia" + " - " + bah[i]);
				System.out.println("Digite o número: ");
				int escolha = myObj.nextInt();
				if (escolha >= 0 && escolha < bah.length) {
					System.out.println("Seu dia é: " + bah[escolha]);
				} else {
					System.out.println("Não é um dia da semana");
				}
					
			}
		}
	}

//Teste Atividade em sala dia 13/11/2024
