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

package TESTE_01;
import java.util.Scanner;
public class TESTE_01 {
    public static void main(String[] args) {
    	System.out.println("Entre com o nome de 4 verduras");
        Scanner s= new Scanner(System.in);
        String[] verduras = new String[4];
        
        verduras[0] = s.next();
        verduras[1] = s.next();
        verduras[2]= s.next();
        verduras[3]= s.next();
        
        for(int i = 0; i <= 3; i++) {
        System.out.println(verduras[i]);

        }
    }
    }

//Referente á aula do dia 26/11/2024

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

//Atividade do dia ??/??/2024

package teste;
import java.util.Scanner;
	public class HelloWorld{
		public static void main(String [] args) {
			Scanner myObj = new Scanner(System.in);
			int opçao;
			double num1, num2, resultado;
			System.out.println("Calculadora");
			System.out.println("+ Soma");
			System.out.println("- Subtração");
			System.out.println("* Multiplicação");
			System.out.println("/ Divisão");
			while (true) {
		 System.out.println("Escolha um operador");
		 opçao = myObj.nextInt();
				if (opçao == 5) {
					break;
				}
		 System.out.println("Digite os números");
		 num1 = myObj.nextDouble();
		 num2 = myObj.nextDouble();
		 switch (opçao) {
		 case 1:
			 resultado = num1 + num2;
			 System.out.println("Resultado: " + resultado);
			 break;
		 case 2: resultado = num1 - num2;
		 System.out.println("Resultado: " + resultado);
		 break;
		 case 3: resultado = num1 * num2;
		 System.out.println("Resultado: " + resultado);
		 break;
		 case 4: 
			 if (num2 != 0) {
			 resultado = num1 / num2;
			 System.out.println("Resultado: " + resultado);
			 } else {
				 System.out.println("Impossível dividir por zero.");
			 } break;
			 default: 
				 System.out.println("Opção inválida.");
   }
}
}
}
