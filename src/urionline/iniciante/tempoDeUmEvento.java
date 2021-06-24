package urionline.iniciante;

import java.util.Scanner;

/*
#DIO - TEMPO DE UM EVENTO
Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril,
iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento
vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a 
calcular a duração deste evento.

ENTRADA
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no
qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar,
no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato,
das duas primeiras linhas, indicando o término do evento.

SAÍDA
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

Exemplo de entrada: https://prnt.sc/16le9j1

*/

//split(): quebra uma String em várias substrings a partir de um caractere definido 
//replace(): substitui caracteres
//replaceAll(): substitui vários caracteres
//Integer.parseInt(): utilizado para converter tipo de dados String para Inteiro

public class tempoDeUmEvento {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;

		String[] xDiaInicial = input.nextLine().split(" ");
		String[] xHoraInicial = input.nextLine().replaceAll(" ", "").split(":");

		String[] xDiaFinal = input.nextLine().split(" ");
		String[] xHoraFinal = input.nextLine().replaceAll(" ", "").split(":");

		// Dia Inicial - Hora Inicial
		int diaInicial = Integer.parseInt(xDiaInicial[1]);
		int horaInicial = Integer.parseInt(xHoraInicial[0]);
		int minutoInicial = Integer.parseInt(xHoraInicial[1]);
		int segundoInicial = Integer.parseInt(xHoraInicial[2]);

		// Dia Final - Hora Final
		int diaFinal = Integer.parseInt(xDiaFinal[1]);
		int horaFinal = Integer.parseInt(xHoraFinal[0]);
		int minutoFinal = Integer.parseInt(xHoraFinal[1]);
		int segundoFinal = Integer.parseInt(xHoraFinal[2]);

		// Segundos
		if (segundoFinal < segundoInicial) {
			totalSegundos += (60 - segundoInicial) + segundoFinal;
			totalMinutos--;
		} else if (segundoFinal > segundoInicial) {
			totalSegundos += segundoFinal - segundoInicial;
		} else {
			totalSegundos = 0;
		}

		// Minutos
		if (minutoFinal < minutoInicial) {
			totalMinutos += (60 - minutoInicial) + minutoFinal;
			totalHoras--;
		} else if (minutoFinal > minutoInicial) {
			totalMinutos += minutoFinal - minutoInicial;
		} else {
			totalMinutos = 0;
		}

		// Horas
		if (horaFinal < horaInicial) {
			totalHoras += (24 - horaInicial) + horaFinal;
			totalDias--;
		} else if (horaFinal > horaInicial) {
			totalHoras += horaFinal - horaInicial;
		} else {
			totalHoras = 0;
		}

		// Dias
		if (diaFinal < diaInicial) {
			totalDias += (30 - diaInicial) + diaFinal;
		} else if (diaFinal > diaInicial) {
			totalDias += diaFinal - diaInicial;
		} else {
			totalDias = 0;
		}

		System.out.println(totalDias + " dia(s)");
		System.out.println(totalHoras + " hora(s)");
		System.out.println(totalMinutos + " minuto(s)");
		System.out.println(totalSegundos + " segundo(s)");
		input.close();
	}
}
