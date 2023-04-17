package LacosRepeticoes;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero, positivo = 0;

		System.out.println("\nDigite um numero: ");
		numero = leia.nextInt();

		do {
			if (numero > 0) {
				positivo += numero;

			}
			System.out.println("\nDigite um numero");
			numero = leia.nextInt();

		} while (numero != 0);
		System.out.println("\nA soma dos numeros postivos é: " + positivo);
	}

}
