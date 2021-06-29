package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1072 - INTERVALO 2 - SOLUÇÃO 02
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
que serão lidos em seguida. Mostre quantos destes valores X estão dentro do 
intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

ENTRADA
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o 
número de casos de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

SAÍDA
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão
fora (out) do intervalo.
*/

public class intervalo2_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int i = 1;
		int in = 0, out = 0;

		while (i <= n) {
			int x = input.nextInt();

			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
			i++;
		}

		System.out.println(in + " in");
		System.out.println(out + " out");
		input.close();

	}

}
