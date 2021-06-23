package urionline.iniciante;

/*
#URI 1059 - NÚMEROS PARES
Faça um programa que mostre os números pares entre 1 e 100, inclusive.

ENTRADA
Neste problema extremamente simples de repetição não há entrada.

SAÍDA
Imprima todos os números pares entre 1 e 100, inclusive se for o caso,
um em cada linha.

*/

public class numerosPares {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
