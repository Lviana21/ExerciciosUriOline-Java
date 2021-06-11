package urionline.iniciante;

import java.util.Locale;
import java.util.Scanner;
/*
#URI 1036 - F�RMULA DE BHASKARA
Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em 
qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
Obviamente se o valor n�o estiver em nenhum destes intervalos, dever� ser impressa a mensagem 
�Fora de intervalo�.

O s�mbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 at� o valor 50.0000000

ENTRADA
O arquivo de entrada cont�m um n�mero com ponto flutuante qualquer.

SA�DA
A sa�da deve ser uma mensagem conforme exemplo abaixo.

*/

public class intervalo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		double valor = input.nextDouble();

		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (valor > 75 && valor <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		input.close();

	}

}
