package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

/*
#URI 1036 - FÓRMULA DE BHASKARA
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, mostre a mensagem correspondente 
“Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

ENTRADA
Leia três valores de ponto flutuante (double) A, B e C.

SAÍDA
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem 
correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.

*/

public class formulaDeBhaskara {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();

		double delta = Math.pow(B, 2) - (4 * A * C);
		double bhaskara1 = 0;
		double bhaskara2 = 0;

		if (delta < 0) {
			System.out.println("Impossivel calcular");
		} else if (A == 0) {
			System.out.println("Impossivel calcular");
		} else {
			bhaskara1 = (-B + Math.sqrt(delta)) / (A + A);
			bhaskara2 = (-B - Math.sqrt(delta)) / (A + A);
			System.out.printf("R1 = %.5f\n", bhaskara1);
			System.out.printf("R2 = %.5f\n", bhaskara2);
		}

		input.close();

	}

}
