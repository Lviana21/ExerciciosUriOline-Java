package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1072 - INTERVALO 2
Leia um valor inteiro N. Este valor ser? a quantidade de valores inteiros X
que ser?o lidos em seguida. Mostre quantos destes valores X est?o dentro do 
intervalo [10,20] e quantos est?o fora do intervalo, mostrando essas informa??es.

ENTRADA
A primeira linha da entrada cont?m um valor inteiro N (N < 10000), que indica o 
n?mero de casos de teste. Cada caso de teste a seguir ? um valor inteiro X (-107 < X <107).

SA?DA
Para cada caso, imprima quantos n?meros est?o dentro (in) e quantos valores est?o
fora (out) do intervalo.
*/

public class intervalo2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 1; i <= N; i++) {
			int numero = input.nextInt();

			if (numero >= 10 && numero <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");
		input.close();
	}

}
