package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
#URI 1048 - AUMENTO DE SALÁRIO
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo 
com a tabela abaixo:

Tabela: https://prnt.sc/15shoni

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de 
reajuste ganho e o índice reajustado, em percentual.

ENTRADA
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

SAÍDA
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste
ganho, conforme exemplo abaixo.

*/

public class aumentoDeSalario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		double reajusteSalario = 0;

		if (salario >= 0.0 && salario <= 400.0) {
			reajusteSalario = (15.0 / 100.0) * salario;
			salario = salario + reajusteSalario;
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", reajusteSalario);
			System.out.println("Em percentual: 15 %");
		} else if (salario >= 400.01 && salario <= 800.00) {
			reajusteSalario = (12.0 / 100.0) * salario;
			salario = salario + reajusteSalario;
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", reajusteSalario);
			System.out.println("Em percentual: 12 %");
		} else if (salario >= 800.01 && salario <= 1200.00) {
			reajusteSalario = (10.0 / 100.0) * salario;
			salario = salario + reajusteSalario;
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", reajusteSalario);
			System.out.println("Em percentual: 10 %");
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			reajusteSalario = (7.0 / 100.0) * salario;
			salario = salario + reajusteSalario;
			System.out.printf("Novo salario: %.2f\n", salario);
			System.out.printf("Reajuste ganho: %.2f\n", reajusteSalario);
			System.out.println("Em percentual: 7 %");
		} else {
			if (salario > 2000.00) {
				reajusteSalario = (4.0 / 100.0) * salario;
				salario = salario + reajusteSalario;
				System.out.printf("Novo salario: %.2f\n", salario);
				System.out.printf("Reajuste ganho: %.2f\n", reajusteSalario);
				System.out.println("Em percentual: 4 %");
			}
		}

		input.close();
	}
}
