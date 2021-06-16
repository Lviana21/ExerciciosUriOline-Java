package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1046 - TEMPO DE JOGO
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo
que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora
e máxima de 24 horas.

ENTRADA
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

SAÍDA
Apresente a duração do jogo conforme exemplo abaixo.
*/

public class tempoDeJogo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int horaInicial = input.nextInt();
		int horaFinal = input.nextInt();

		if (horaInicial > horaFinal) {
			System.out.println("O JOGO DUROU " + (24 - (horaInicial - horaFinal)) + " HORA(S)");
		} else if (horaFinal > horaInicial) {
			System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}

		input.close();
	}

}
