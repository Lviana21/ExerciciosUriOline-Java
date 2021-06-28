package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1065 - PARES ENTRE CINCO N�MEROS
Fa�a um programa que leia 5 valores inteiros. Conte quantos destes valores digitados
s�o pares e mostre esta informa��o.

ENTRADA
O arquivo de entrada cont�m 5 valores inteiros quaisquer.

SA�DA
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores 
pares lidos.
*/

public class paresEntreCincoNumeros {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int pares = 0;

		for (int cont = 1; cont <= 5; cont++) {
			int numero = input.nextInt();

			if (numero % 2 == 0) {
				pares++;
			}

		}

		System.out.println(pares + " valores pares");
		input.close();
	}
}
