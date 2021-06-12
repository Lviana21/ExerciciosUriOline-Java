package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
#URI 1041 - COORDENADAS DE UM PONTO
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou
na origem (x = y = 0).

Eixos X e Y = https://prnt.sc/155blvq

Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

ENTRADA
A entrada contem as coordenadas de um ponto.

SAÍDA
A saída deve apresentar o quadrante em que o ponto se encontra.

*/

public class coordenadasDeUmPonto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double x = input.nextDouble();
		double y = input.nextDouble();

		if (x == y & y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (y == 0) {
			System.out.println("Eixo X");
		} else if (x > 0 & y > 0) {
			System.out.println("Q1");
		} else if (x < 0 & y > 0) {
			System.out.println("Q2");
		} else if (x < 0 & y < 0) {
			System.out.println("Q3");
		} else if (x > 0 & y < 0) {
			System.out.println("Q4");
		}

		input.close();

	}

}
