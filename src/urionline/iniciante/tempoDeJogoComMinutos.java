package urionline.iniciante;

import java.util.Scanner;

public class tempoDeJogoComMinutos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int hIncial = input.nextInt();
		int mInicial = input.nextInt();
		int hFinal = input.nextInt();
		int mFinal = input.nextInt();
		int horas = 0;
		int minutos = 0;

		if (hIncial >= 0 && hIncial <= 24 && hFinal >= 0 && hFinal <= 24 && mInicial >= 0 && mInicial <= 60
				&& mFinal >= 0 && mFinal <= 60) {
			if (mFinal > mInicial) {
				minutos = mFinal - mInicial;
			} else if (mFinal < mInicial) {
				minutos = mFinal - mInicial + 60;
				hFinal = hFinal - 1;
			}
			if (hFinal >= hIncial) {
				horas = hFinal - hIncial;
			} else if (hFinal < hIncial) {
				horas = hFinal - hIncial + 24;
			}
			if (horas == 0 && minutos == 0) {
				horas = 24;
			}
		}
		System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

		input.close();
	}

}
