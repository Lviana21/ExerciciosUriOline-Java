package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1052 - M�S
Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor,
deve ser apresentado como resposta o m�s do ano por extenso, em ingl�s, com
a primeira letra mai�scula.

ENTRADA
A entrada cont�m um �nico valor inteiro.

SA�DA
Imprima por extenso o nome do m�s correspondente ao n�mero existente na entrada,
com a primeira letra em mai�scula.

*/

public class mes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int mes = input.nextInt();

		switch (mes) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			break;
		}

		input.close();
	}

}
