package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

//Uri 1011
public class Esfera {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double pi = 3.14159;

		Scanner input = new Scanner(System.in);

		double raioEsfera = input.nextDouble();
		double volume = ((4 / 3.0 * pi) * (raioEsfera * raioEsfera * raioEsfera));

		System.out.printf("VOLUME = %.3f\n", volume);

		input.close();

	}

}
