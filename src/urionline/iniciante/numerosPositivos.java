package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
#URI 1060 - NÚMEROS POSITIVOS
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos
(desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

ENTRADA
Seis valores, negativos e/ou positivos.

SAÍDA
Imprima uma mensagem dizendo quantos valores positivos foram lidos.

*/

public class numerosPositivos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double numero = 0;
		int positivo = 0;

		for (int i = 1; i <= 6; i++) {

			numero = input.nextDouble();

			if (numero > 0) {
				positivo++;
			}

		}
		System.out.println(positivo + " valores positivos");

		input.close();

	}
}
