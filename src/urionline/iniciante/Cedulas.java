package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1018
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
no qual o valor pode ser decomposto.As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
A seguir mostre o valor lido e a relação de notas necessárias.


ENTRADA
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).


SAÍDA
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha,
caso contrário seu programa apresentará a mensagem: “Presentation Error”.
*/

public class Cedulas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		System.out.println(N);

		int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };

		for (int cedula : cedulas) {
			int quantidadeDeCedulas = N / cedula;
			System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeDeCedulas, cedula);
			N -= quantidadeDeCedulas * cedula;
		}

		input.close();

	}

}
