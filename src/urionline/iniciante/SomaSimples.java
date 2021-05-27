package urionline.iniciante;

import java.util.Scanner;

//Uri 1003 
public class SomaSimples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int SOMA = A + B;

		System.out.println("SOMA = " + SOMA);
		
		input.close();

	}

}
