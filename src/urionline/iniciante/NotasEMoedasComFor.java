package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedasComFor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		double valor = input.nextDouble();

		// Array de Notas e Moedas
		int[] notas = { 100, 50, 20, 10, 5, 2 };
		double[] moedas = { 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 };

		double nota;
		System.out.println("NOTAS:");
		for (int posicaoNota = 0; posicaoNota < notas.length; posicaoNota++) {
			nota = valor / notas[posicaoNota];
			System.out.printf("%d nota(s) de R$ %d.00\n", (int) nota, notas[posicaoNota]);
			valor = valor % notas[posicaoNota];

		}

		System.out.println("MOEDAS:");

		for (int posicaoMoeda = 0; posicaoMoeda < notas.length; posicaoMoeda++) {
			nota = (double) (valor / moedas[posicaoMoeda]);
			System.out.println((int) nota + " moeda(s) de R$ " + String.format("%.2f", moedas[posicaoMoeda]));
			valor = (double) (valor % moedas[posicaoMoeda]);

		}

		input.close();

	}

}
