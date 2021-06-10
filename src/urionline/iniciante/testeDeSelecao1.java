package urionline.iniciante;

import java.io.IOException;
import java.util.Scanner;

/*
#URI 1035 - TESTE DE SELE��O 1
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C 
e se D for maior do que A, e a soma de C com D for maior que a soma de 
A e B e se C e D, ambos, forem positivos e se a vari�vel A for par escrever
a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".

ENTRADA
Quatro n�meros inteiros A, B, C e D.

SA�DA
Mostre a respectiva mensagem ap�s a valida��o dos valores.

*/

public class testeDeSelecao1 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();

		if (B > C && D > A && (C + D) > (A + B) && A % 2 == 0) {

			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
		input.close();
	}

}
