package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
#URI 1019 - CONVERS�O DO TEMPO
Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento
em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.


ENTRADA
O arquivo de entrada cont�m um valor inteiro N.


SA�DA
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos,
conforme exemplo fornecido.
*/

public class ConversaoDeTempo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int valor = input.nextInt();

		// Convers�o em Horas
		int horas = valor / 3600;
		int restoHrs = valor % 3600;

		// Convers�o em Minutos
		int minutos = restoHrs / 60;
		int restoMts = restoHrs % 60;

		// Segundos
		int segundos = restoMts;

		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

		input.close();
	}

}
