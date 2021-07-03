package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1074 - PAR OU ÍMPAR
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN),
ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), 
embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá
imprimir apenas NULL.

ENTRADA
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

SAÍDA
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras 
deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
*/

public class parOuImpar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		
		int cont = 0;
		while (cont < N) {
			
			int numero = input.nextInt();
			if (numero == 0) {
				System.out.println("NULL");
			} else if (numero % 2 == 0 && numero > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (numero % 2 == 0 && numero < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (numero % 2 != 0 && numero > 0) {
				System.out.println("ODD POSITIVE");
			} else if (numero % 2 != 0 && numero < 0) {
				System.out.println("ODD NEGATIVE");
			}

			cont++;
		}

		input.close();

	}

}
