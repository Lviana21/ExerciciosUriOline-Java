package urionline.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
#URI 1043 - TRI�NGULO
Leia 3 valores reais (A, B e C) e verifique se eles formam ou n�o um tri�ngulo.
Em caso positivo, calcule o per�metro do tri�ngulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a �rea do trap�zio que tem A e B como base e C como altura,
mostrando a mensagem

Area = XX.X

ENTRADA
A entrada cont�m tr�s valores reais.

SA�DA
O resultado deve ser apresentado com uma casa decimal.

*/

public class triangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();

		/*
		 * Validando se � um Tri�ngulo A + B = ? > C A + C = ? > B B + C = ? > A
		 */

		if ((A + B) > C && (A + C) > B && (B + C) > A) {
			System.out.printf("Perimetro = %.1f\n", (A + B + C));
		} else {
			System.out.printf("Area = %.1f\n", ((A + B) * C) / 2);
		}

		input.close();
	}

}
