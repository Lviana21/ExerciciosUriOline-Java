package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		int codPeca1 = input.nextInt();
		int qtdPeca1 = input.nextInt();
		double valorPeca1 = input.nextDouble();
		int codPeca2 = input.nextInt();
		int qtdPeca2 = input.nextInt();
		double valorPeca2 = input.nextDouble();

		double valorTotal = ((qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2));

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

		input.close();

	}

}
