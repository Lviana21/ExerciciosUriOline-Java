package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Setando como pardr�o a localiza��o do Estados Unidos para utilizar o ponto
										// "substituir virgula por ponto"
		double n = 3.14159;

		Scanner input = new Scanner(System.in);

		double raio = input.nextDouble();
		double area = n * raio * raio;

		System.out.printf("A=%.4f\n", area);
		// formatando casas decimais - 4 casas decimais, o "f" � do format, ent�o
		// utiliza printf

		input.close();

	}
}