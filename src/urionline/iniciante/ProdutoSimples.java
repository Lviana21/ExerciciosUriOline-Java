package urionline.iniciante;

import java.util.Scanner;

//Uri 1004
public class ProdutoSimples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int PROD = A * B;

		System.out.println("PROD = " + PROD);

		input.close();

	}

}
