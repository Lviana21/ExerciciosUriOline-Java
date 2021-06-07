package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
#URI 1019 - CONVERSÃO DO TEMPO
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento
em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.


ENTRADA
O arquivo de entrada contém um valor inteiro N.


SAÍDA
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos,
conforme exemplo fornecido.
*/

public class ConversaoDeTempo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int valor = input.nextInt();

		// Conversão em Horas
		int horas = valor / 3600;
		int restoHrs = valor % 3600;

		// Conversão em Minutos
		int minutos = restoHrs / 60;
		int restoMts = restoHrs % 60;

		// Segundos
		int segundos = restoMts;

		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

		input.close();
	}

}
