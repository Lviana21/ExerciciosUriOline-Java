package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1073 - QUADRADO DE PARES
Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares,
de 1 at� N, inclusive N, se for o caso.

ENTRADA
A entrada cont�m um valor inteiro N (5 < N < 2000).

SA�DA
Imprima o quadrado de cada um dos valores pares, de 1 at� N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padr�o apresentarem como sa�da 1e+006 ao inv�s de
1000000 o que ocasionar� resposta errada. Neste caso, configure a precis�o adequadamente para
que isso n�o ocorra.
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
