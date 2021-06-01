package urionline.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Uri 1014
public class Consumo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double distanciaPercorrida = input.nextDouble();
		double combustivelGasto = input.nextDouble();
		double consumo = (distanciaPercorrida / combustivelGasto);

		DecimalFormat df = new DecimalFormat("0.###"); // Formatação de casas decimais
		String formatado = df.format(consumo);

		System.out.printf(formatado + " km/l\n");

		input.close();

	}

}
