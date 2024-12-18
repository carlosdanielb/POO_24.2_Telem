package teste;

public class Teste{
	public static void main(String [] args) {
	System.out.println("Heloo world!!!");	
	}
}

/* Trabalho em Java 2
Números primos
*/
package teste;

public class HelloWorld {
	public static void main(String[] args) {

		for (int num = 2; num <= 100; num++) {
			if (primo(num)) {
				System.out.print(num + " ");
			}
		}
	}

	public static boolean primo(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
// Trabalho em Java 2
// Quadrados asteriscos

package TESTE_01;

import java.util.Scanner;

public class TESTE_01 {
	public static void main(String[] args) {
		System.out.println("digite qualquer número: ");
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt(); 

		for (int c = 0; c < tamanho; c++) {
			for (int l = 0; l < tamanho; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

// Trabalho em Java 2
// Calculadora Java

package teste;

import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int opçao;
		double num1, num2, resultado;
		System.out.println("Calculadora");
		System.out.println("1. + Soma");
		System.out.println("2. - Subtração");
		System.out.println("3. * Multiplicação");
		System.out.println("4. / Divisão");
		System.out.println("Escolha um operador");
		while (true) {
			opçao = myObj.nextInt();
			if (opçao >= 5) {
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
			case 2:
				resultado = num1 - num2;
				System.out.println("Resultado: " + resultado);
				break;
			case 3:
				resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
				break;
			case 4:
				if (num2 != 0) {
					resultado = num1 / num2;
					System.out.println("Resultado: " + resultado);
				} else {
					System.out.println("Impossível dividir por zero.");
				}
				break;
			default:
			}
			System.out.println("para sair, digite qualquer número maior que 5.");
		}
	}
}
