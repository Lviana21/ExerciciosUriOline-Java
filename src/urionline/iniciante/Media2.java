package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

//Uri 1006
public class Media2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

		System.out.printf("MEDIA = %.1f\n", MEDIA);

		input.close();

	}

}
