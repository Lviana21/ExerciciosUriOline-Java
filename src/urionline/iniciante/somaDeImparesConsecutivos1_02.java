package urionline.iniciante;
import java.util.Scanner;

/*
#URI 1071 - SOMA DE IMPARES CONSECUTIVOS 1 - SOLU��O 02
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos n�meros
impares entre eles.

ENTRADA
O arquivo de entrada cont�m dois valores inteiros.

SA�DA
O programa deve imprimir um valor inteiro. Este valor � a soma dos valores �mpares
que est�o entre os valores fornecidos na entrada que dever� caber em um inteiro.
*/

public class somaDeImparesConsecutivos1_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int soma = 0;
		int maximo, minimo = 0;
		
		if(x < y) {
			minimo = x;
			maximo = y;
		}else {
			maximo = x;
			minimo = y;
		}
		
		int i = minimo + 1;
		
		while ( i < maximo) {
			if(i % 2 != 0) {
				soma = soma + i;
			}
			i++;
		}
		System.out.println(soma);
		input.close();
	}
}
