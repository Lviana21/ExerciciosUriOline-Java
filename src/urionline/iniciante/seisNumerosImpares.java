package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1070 - SEIS NÚMEROS ÍMPARES
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X
, um valor por linha, inclusive o X ser for o caso.

ENTRADA
A entrada será um valor inteiro positivo.

SAÍDA
A saída será uma sequência de seis números ímpares.
*/

public class seisNumerosImpares {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int cont = 0;

		while (cont < 6) {

			if (x % 2 != 0) {
				System.out.println(x);
				cont++;
			}
			x++;
		}

		input.close();
	}

}
