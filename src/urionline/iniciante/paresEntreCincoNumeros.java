package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1065 - PARES ENTRE CINCO NÚMEROS
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados
são pares e mostre esta informação.

ENTRADA
O arquivo de entrada contém 5 valores inteiros quaisquer.

SAÍDA
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
