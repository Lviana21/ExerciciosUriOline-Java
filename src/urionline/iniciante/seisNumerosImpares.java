package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1070 - SEIS N�MEROS �MPARES
Leia um valor inteiro X. Em seguida apresente os 6 valores �mpares consecutivos a partir de X
, um valor por linha, inclusive o X ser for o caso.

ENTRADA
A entrada ser� um valor inteiro positivo.

SA�DA
A sa�da ser� uma sequ�ncia de seis n�meros �mpares.
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
