package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1050 - DDD
Leia um n�mero inteiro que representa um c�digo de DDD para discagem interurbana.
Em seguida, informe � qual cidade o DDD pertence, considerando a tabela abaixo:

Tabela: https://prnt.sc/15x27uv

Se a entrada for qualquer outro DDD que n�o esteja presente na tabela acima, o programa
dever� informar: DDD nao cadastrado

ENTRADA
A entrada consiste de um �nico valor inteiro.

SA�DA
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado
caso n�o existir DDD correspondente ao n�mero digitado.

*/

public class ddd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int ddd = input.nextInt();

		if (ddd == 61) {
			System.out.println("Brasilia");
		} else if (ddd == 71) {
			System.out.println("Salvador");
		} else if (ddd == 11) {
			System.out.println("Sao Paulo");
		} else if (ddd == 21) {
			System.out.println("Rio de Janeiro");
		} else if (ddd == 32) {
			System.out.println("Juiz de Fora");
		} else if (ddd == 19) {
			System.out.println("Campinas");
		} else if (ddd == 27) {
			System.out.println("Vitoria");
		} else if (ddd == 31) {
			System.out.println("Belo Horizonte");
		} else {
			System.out.println("DDD nao cadastrado");
		}

		input.close();

	}
}
