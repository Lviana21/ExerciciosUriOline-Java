package urionline.iniciante;

/*
#URI 1059 - N�MEROS PARES
Fa�a um programa que mostre os n�meros pares entre 1 e 100, inclusive.

ENTRADA
Neste problema extremamente simples de repeti��o n�o h� entrada.

SA�DA
Imprima todos os n�meros pares entre 1 e 100, inclusive se for o caso,
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
