package urionline.iniciante;

import java.util.Scanner;

//Uri 1013
public class OMaior {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();

		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

		System.out.println(maiorABC + " eh o maior");

		input.close();
	}
}
