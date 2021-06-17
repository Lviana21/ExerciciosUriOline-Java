package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1047 - TEMPO DE JOGO COM MINUTOS - SOLUÇÃO 02
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

ENTRADA
Quatro números inteiros representando a hora de início e fim do jogo.

SAÍDA
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

*/

public class tempoDeJogoComMinutos_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int hIncial = input.nextInt();
		int mInicial = input.nextInt();
		int hFinal = input.nextInt();
		int mFinal = input.nextInt();

		if (hIncial > hFinal) {
			if (mInicial > mFinal) {
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS(S)", (24 - (hIncial - hFinal)),
						(60 - (mInicial - mFinal)));
			} else if (mFinal > mInicial) {
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS(S)", (24 - (hIncial - hFinal)),
						(mFinal - mInicial));
			} else {
				if (mInicial == mFinal || mFinal == mInicial) {
					System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)", (24 - (hIncial - hFinal)));
				}
			}

		} else if (hFinal > hIncial) {
			if (mFinal > mInicial) {
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS(S)", (hFinal - hIncial), (mFinal - mInicial));
			} else if (mInicial > mFinal) {
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS(S)", (hFinal - hIncial),
						(60 - (mInicial - mFinal)));
			} else {
				if (mInicial == mFinal || mFinal == mInicial) {
					System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)", (hFinal - hIncial));
				}
			}

		} else {
			if (hIncial == hFinal && mInicial == mFinal) {
				System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
			} else {
				if (hIncial == hFinal) {
					if (mInicial == mFinal) {
						System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
					} else {
						if (mFinal > mInicial) {
							System.out.printf("O JOGO DUROU 24 HORA(S) E %d MINUTOS(S)", (mFinal - mInicial));
						} else if (mInicial > mFinal) {
							System.out.printf("O JOGO DUROU 24 HORA(S) E %d MINUTOS(S)", (60 - (mInicial - mFinal)));
						}
					}
				} else {
					if (mInicial == mFinal) {
						if (hIncial > hFinal) {
							System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTOS(S)", (24 - (hIncial - hFinal)));
						} else if (hFinal > hIncial) {
							System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTOS(S)", (hFinal - hIncial));
						}
					}

				}
			}
		}

		input.close();

	}

}
