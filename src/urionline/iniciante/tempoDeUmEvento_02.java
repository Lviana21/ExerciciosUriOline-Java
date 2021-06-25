package urionline.iniciante;

import java.util.Scanner;
//##URI 1061 - TEMPO DE UM EVENTO SOLUÇÃO 02


public class tempoDeUmEvento_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;

		String[] xDiaInicial = input.nextLine().split(" ");
		String[] xHoraInicial = input.nextLine().replaceAll(" ", "").split(":");

		String[] xDiaFinal = input.nextLine().split(" ");
		String[] xHoraFinal = input.nextLine().replaceAll(" ", "").split(":");

		int diaInicial = Integer.parseInt(xDiaInicial[1]);
		int horaInicial = Integer.parseInt(xHoraInicial[0]);
		int minutoInicial = Integer.parseInt(xHoraInicial[1]);
		int segundoInicial = Integer.parseInt(xHoraInicial[2]);

		int diaFinal = Integer.parseInt(xDiaFinal[1]);
		int horaFinal = Integer.parseInt(xHoraFinal[0]);
		int minutoFinal = Integer.parseInt(xHoraFinal[1]);
		int segundoFinal = Integer.parseInt(xHoraFinal[2]);

		if (diaFinal < diaInicial) {
			totalDias += (30 - diaInicial) + diaFinal;
		} else if (diaFinal > diaInicial) {
			totalDias += diaFinal - diaInicial;
		} else {
			totalDias = 0;
		}

		if (horaFinal < horaInicial) {
			totalHoras += (24 - horaInicial) + horaFinal;
			totalDias--;
		} else if (horaFinal > horaInicial) {
			totalHoras += horaFinal - horaInicial;
		} else {
			totalHoras = 0;
		}

		if (minutoFinal < minutoInicial) {
			totalMinutos += (60 - minutoInicial) + minutoFinal;
			totalHoras--;
		} else if (minutoFinal > minutoInicial) {
			totalMinutos += minutoFinal - minutoInicial;
		}

		if (segundoFinal < segundoInicial) {
			totalSegundos += (60 - segundoInicial) + segundoFinal;
			totalMinutos--;
		} else if (segundoFinal > segundoInicial) {
			totalSegundos += segundoFinal - segundoInicial;
		} else {
			totalSegundos = 0;
		}

		System.out.println(totalDias + " dia(s)");
		System.out.println(totalHoras + " hora(s)");
		System.out.println(totalMinutos + " minuto(s)");
		System.out.println(totalSegundos + " segundo(s)");

		input.close();
	}

}
