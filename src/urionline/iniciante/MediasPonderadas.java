package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
#URI 1079 - MÉDIAS PONDERADAS
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

ENTRADA
O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a 
seguir contém um caso de teste com três valores com uma casa decimal cada valor.

SAÍDA
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
*/

public class MediasPonderadas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		double media = 0;

		for (int cont = 0; cont < N; cont++) {

			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.println(String.format("%.1f", media));
		}

		input.close();
	}

}
