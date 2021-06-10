package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;
/*
#URI 1021
Leia um valor de ponto flutuante com duas casas decimais. Este valor 
representa um valor monet�rio. A seguir, calcule o menor n�mero de notas 
e moedas poss�veis no qual o valor pode ser decomposto. As notas 
consideradas s�o de 100, 50, 20, 10, 5, 2. As moedas poss�veis s�o 
de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a rela��o de notas necess�rias.

ENTRADA
O arquivo de entrada cont�m um valor de ponto flutuante N (0 <= N <= 1000000.00).

SA�DA
Imprima a quantidade m�nima de notas e moedas necess�rias para trocar o valor 
inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal.

*/

public class NotasEMoedas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double valorInformado = input.nextDouble();
		int valor = 0;

		System.out.println("NOTAS:");
		valor = (int) valorInformado / 100;
		System.out.printf("%d notas(s) de R$ 100.00\n", valor);
		valorInformado = valorInformado % 100.0;

		valor = (int) valorInformado / 50;
		System.out.printf("%d notas(s) de R$ 50.00\n", valor);
		valorInformado = valorInformado % 50.0;

		valor = (int) valorInformado / 20;
		System.out.printf("%d notas(s) de R$ 20.00\n", valor);
		valorInformado = valorInformado % 20.0;

		valor = (int) valorInformado / 10;
		System.out.printf("%d notas(s) de R$ 20.00\n", valor);
		valorInformado = valorInformado % 10.0;

		valor = (int) valorInformado / 5;
		System.out.printf("%d notas(s) de R$ 5.00\n", valor);
		valorInformado = valorInformado % 5.0;

		valor = (int) valorInformado / 2;
		System.out.printf("%d notas(s) de R$ 2.00\n", valor);
		valorInformado = valorInformado % 2.0;

		valorInformado = valorInformado * 100.0;

		System.out.println("MOEDAS:");

		valor = (int) valorInformado / 100;
		System.out.printf("%d moeda(s) de R$ 1.00\n", valor);
		valorInformado = valorInformado % 100.0;

		valor = (int) valorInformado / 50;
		System.out.printf("%d moeda(s) de R$ 0.50\n", valor);
		valorInformado = valorInformado % 50.0;

		valor = (int) valorInformado / 25;
		System.out.printf("%d moeda(s) de R$ 0.25\n", valor);
		valorInformado = valorInformado % 25.0;

		valor = (int) valorInformado / 10;
		System.out.printf("%d moeda(s) de R$ 0.10\n", valor);
		valorInformado = valorInformado % 10.0;

		valor = (int) valorInformado / 5;
		System.out.printf("%d moeda(s) de R$ 0.05\n", valor);
		valorInformado = valorInformado % 5.0;

		valor = (int) valorInformado / 1;
		System.out.printf("%d moeda(s) de R$ 0.01\n", valor);
		valorInformado = valorInformado % 1.0;

		input.close();

	}

}
