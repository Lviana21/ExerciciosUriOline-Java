package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1075 - RESTO 2
Leia um valor inteiro N. Apresente todos os n�meros entre 1 e 10000 que divididos 
por N d�o resto igual a 2.

ENTRADA
A entrada cont�m um valor inteiro N (N < 10000).

SA�DA
Imprima todos valores que quando divididos por N d�o resto = 2, um por linha.
*/

public class resto2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();

		for (int i = 1; i < 10000; i++) {

			if (i % N == 2) {
				System.out.println(i);
			}
		}

		input.close();
	}
}
