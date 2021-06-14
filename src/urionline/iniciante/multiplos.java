package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1044 - M�LTIPLOS
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" 
ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si.

ENTRADA
A entrada cont�m valores inteiros.

SA�DA
A sa�da deve conter uma das mensagens conforme descrito acima.

*/

public class multiplos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		input.close();
	}

}
