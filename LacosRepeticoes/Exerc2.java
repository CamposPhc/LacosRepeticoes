package LacosRepeticoes;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero= 0, menor = 0, maior = 0;

		
		while (numero >= 0) {
			if (numero <= 21) {
				menor++;
			} else if(numero >=50){
				maior++;

			}
			System.out.println("\nDigite sua idade: ");
			numero = leia.nextInt();
		}
		System.out.println("\nQuantidade de idades menor que 21:  " + menor);
		System.out.println("\nQuandtidade de idades maior que 21: " + maior);
	}

}
