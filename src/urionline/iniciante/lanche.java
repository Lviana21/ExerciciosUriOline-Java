package urionline.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
#URI 1038 - LANCHE
Com base na tabela abaixo, escreva um programa que leia o código de um
item e a quantidade deste item. A seguir, calcule e mostre o valor da conta
a pagar.

Tabela: http://i.prntscr.com/QXHcLFPvRy6EW1MdseToEg.png

ENTRADA
O arquivo de entrada contém dois valores inteiros correspondentes ao código 
e à quantidade de um item conforme tabela acima.

SAÍDA
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a
ser pago, com 2 casas após o ponto decimal

*/

public class lanche {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		int codItem = input.nextInt();
		int qtdItem = input.nextInt();

		double total = 0;

		switch (codItem) {
		case 1:
			total = (qtdItem * 4.00);
			break;
		case 2:
			total = (qtdItem * 4.50);
			break;
		case 3:
			total = (qtdItem * 5.00);
			break;
		case 4:
			total = (qtdItem * 2.00);
			break;
		case 5:
			total = (qtdItem * 1.50);
			break;
		default:
			break;
		}
		System.out.printf("Total: R$ %.2f\n", total);

		input.close();

	}

}
