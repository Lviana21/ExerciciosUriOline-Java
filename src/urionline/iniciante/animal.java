package urionline.iniciante;

import java.util.Scanner;

/*
#URI 1049 - ANIMAL
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo,
da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três
palavras fornecidas.

Tabela: https://prnt.sc/15wvot0

ENTRADA
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima,
com todas as letras minúsculas.

SAÍDA
Imprima o nome do animal correspondente à entrada fornecida.
*/

public class animal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String a = input.nextLine();
		String b = input.nextLine();
		String c = input.nextLine();

		String vertebrado = "vertebrado";
		String ave = "ave";
		String carnivoro = "carnivoro";
		String onivoro = "onivoro";
		String mamifero = "mamifero";
		String herbivoro = "herbivoro";
		String invertebrado = "invertebrado";
		String inseto = "inseto";
		String hematofago = "hematofago";
		String anelideo = "anelideo";

		if (a.equals(vertebrado)) {
			if (b.equals(ave)) {
				if (c.equals(carnivoro)) {
					System.out.println("aguia");
				} else {
					if (c.equals(onivoro)) {
						System.out.println("pomba");
					}
				}
			} else {
				if (b.equals(mamifero)) {
					if (c.equals(onivoro)) {
						System.out.println("homem");
					} else {
						if (c.equals(herbivoro)) {
							System.out.println("vaca");
						}
					}
				}
			}
		} else {
			if (a.equals(invertebrado)) {
				if (b.equals(inseto)) {
					if (c.equals(hematofago)) {
						System.out.println("pulga");
					} else {
						if (c.equals(herbivoro)) {
							System.out.println("lagarta");
						}
					}
				} else {
					if (b.equals(anelideo)) {
						if (c.equals(hematofago)) {
							System.out.println("sanguessuga");
						} else {
							if (c.equals(onivoro)) {
								System.out.println("minhoca");
							}
						}
					}
				}
			}
		}

		input.close();
	}
}
