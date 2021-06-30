package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1073 - QUADRADO DE PARES
Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares,
de 1 até N, inclusive N, se for o caso.

ENTRADA
A entrada contém um valor inteiro N (5 < N < 2000).

SAÍDA
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de
1000000 o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para
que isso não ocorra.
*/

public class quadradoDePares {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int i = 1;
		while (i <= n) {

			if (i % 2 == 0) {
				System.out.println(i + "^2 = " + (int) Math.pow(i, 2));
			}
			i++;
		}

		input.close();
	}
}
