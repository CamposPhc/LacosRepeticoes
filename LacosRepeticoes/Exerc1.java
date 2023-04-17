package LacosRepeticoes;
import java.util.Scanner;
public class Exerc1 {

    public static void main(String[] args) {

        int x, numero, pares = 0, impares = 0;

        Scanner leia = new Scanner(System.in);

        for ( x = 1; x <= 10; x++) {
            System.out.println("Digite o " + x + " número: ");
             numero = leia.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

    }
}