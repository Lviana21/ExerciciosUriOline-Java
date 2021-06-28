package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1066 - PARES, IMPARES, POSITIVOS E NEGATIVOS
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares,
quantos valores digitados foram ímpares, quantos valores digitados foram positivos
e quantos valores digitados foram negativos.

ENTRADA
O arquivo de entrada contém 5 valores inteiros quaisquer.

SAÍDA
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo
o final de linha após cada uma.
*/

public class paresImparesPositivosENegativos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int pares = 0, impares = 0, positivos = 0, negativos = 0, numero = 0;

		for (int i = 1; i <= 5; i++) {
			numero = input.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}

			if (numero > 0) {
				positivos++;
			} else {
				if (numero < 0) {
					negativos++;
				}
			}
		}

		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");

		input.close();
	}
}
