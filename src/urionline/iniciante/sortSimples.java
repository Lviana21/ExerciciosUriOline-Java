package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1042 - COORDENADAS DE UM PONTO
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente,
uma linha em branco e em seguida, os valores na sequência como foram lidos.


ENTRADA
A entrada contem três números inteiros.

SAÍDA
Imprima a saída conforme foi especificado.

*/

public class sortSimples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		if (n1 < n2 && n1 < n3) {
			System.out.println(n1);
			if (n2 < n3) {
				System.out.println(n2);
				System.out.println(n3);
			} else {
				System.out.println(n3);
				System.out.println(n2);
			}
		} else if (n2 < n3) {
			System.out.println(n2);
			if (n1 < n3) {
				System.out.println(n1);
				System.out.println(n3);
			} else {
				System.out.println(n3);
				System.out.println(n1);
			}
		} else {
			System.out.println(n3);
			if (n1 < n2) {
				System.out.println(n1);
				System.out.println(n2);
			} else {
				System.out.println(n2);
				System.out.println(n1);
			}
		}

		System.out.println("");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		input.close();
	}

}
