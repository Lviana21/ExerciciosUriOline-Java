package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1020 - IDADE EM DIAS
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

ENTRADA
O arquivo de entrada contém um valor inteiro.


SAÍDA
Imprima a saída conforme exemplo fornecido.
*/

public class IdadeEmDias {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int anoEmDias = input.nextInt();

		int ano = anoEmDias / 365;
		int restoAno = anoEmDias % 365;

		int meses = restoAno / 30;
		int restoMeses = restoAno % 30;

		int dias = restoMeses;

		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, meses, dias);

		input.close();

	}
}
