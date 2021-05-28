package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

//Uri 1009
public class SalarioComBonus {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		String nomeVendedor = input.nextLine();
		double salarioFixo = input.nextDouble();
		double totalVendasMes = input.nextDouble();
		double TOTAL = (salarioFixo + (totalVendasMes * 0.15));

		System.out.printf("TOTAL = R$ %.2f\n", TOTAL);

		input.close();

	}

}
