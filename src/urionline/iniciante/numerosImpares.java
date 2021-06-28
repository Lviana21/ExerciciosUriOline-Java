package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1067 - N�MEROS IMPARES
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X,
um valor por linha, inclusive o X, se for o caso.

ENTRADA
O arquivo de entrada cont�m 1 valor inteiro qualquer.

SA�DA
Imprima todos os valores �mpares de 1 at� X, inclusive X, se for o caso.
*/

public class numerosImpares {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		int X = input.nextInt();

		for (int i = 1; i <= X; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		input.close();

	}

}
