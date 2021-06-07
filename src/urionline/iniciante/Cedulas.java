package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1018
Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas)
no qual o valor pode ser decomposto.As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1.
A seguir mostre o valor lido e a rela��o de notas necess�rias.


ENTRADA
O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).


SA�DA
Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias,
conforme o exemplo fornecido. N�o esque�a de imprimir o fim de linha ap�s cada linha,
caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
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
