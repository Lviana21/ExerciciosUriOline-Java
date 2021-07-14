package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1078 - TABUADA
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

ENTRADA
A entrada contém um valor inteiro N (2 < N < 1000).

SAÍDA
Imprima a tabuada de N, conforme o exemplo fornecido.
*/

public class tabuada {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valor = input.nextInt();
		int tabuada = 0;

		for (int cont = 1; cont <= 10; cont++) {
			tabuada = valor * cont;
			System.out.println(cont + " x " + valor + " = " + tabuada);
		}

		input.close();

	}

}
