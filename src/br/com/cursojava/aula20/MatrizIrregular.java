package br.com.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n�mero de pessoas que ser�o entrevistadas: ");
		int numEntrevistados = scan.nextInt();

		String[][] nomesFilhos = new String[numEntrevistados][];

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos: ");
			int qntdFilhos = scan.nextInt();

			nomesFilhos[i] = new String[qntdFilhos];

			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho: " + (j + 1));

				nomesFilhos[i][j] = scan.next();
			}
		}
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("A pessoa " + (i + 1) + ": tem " + nomesFilhos[i].length + " filho(s).");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

	}

}
