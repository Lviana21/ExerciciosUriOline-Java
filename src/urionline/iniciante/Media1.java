package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

//Uri 1005
public class Media1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Converter virgula em ponto "," em "."

		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double MEDIA = ((A * 3.5)  + (B * 7.5)) / 11;

		System.out.printf("MEDIA = %.5f\n", MEDIA);

		input.close();

	}

}
