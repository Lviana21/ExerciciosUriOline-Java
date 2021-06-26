package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
#URI 1064 - POSITIVOS E MÉDIA
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
com um dígito após o ponto decimal.

ENTRADA
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
Pelo menos um destes números será positivo.

SAÍDA
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve
mostrar a média dos valores positivos digitados.

*/

public class positivosEMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double numero, media = 0;
		int positivo = 0;
		double contNumero = 0;

		for (int cont = 1; cont <= 6; cont++) {
			numero = input.nextDouble();

			if (numero > 0) {
				positivo++;

				contNumero = contNumero + numero;
				media = contNumero / positivo;
			}
		}

		System.out.println(positivo + " valores positivos");
		System.out.printf("%.1f\n", media);
		input.close();
	}
}
