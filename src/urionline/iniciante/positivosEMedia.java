package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
#URI 1064 - POSITIVOS E M�DIA
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na pr�xima linha, deve-se mostrar a m�dia de todos os valores positivos digitados,
com um d�gito ap�s o ponto decimal.

ENTRADA
A entrada cont�m 6 n�meros que podem ser valores inteiros ou de ponto flutuante.
Pelo menos um destes n�meros ser� positivo.

SA�DA
O primeiro valor de sa�da � a quantidade de valores positivos. A pr�xima linha deve
mostrar a m�dia dos valores positivos digitados.

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
