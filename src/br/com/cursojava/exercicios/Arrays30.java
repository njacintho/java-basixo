package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Arrays30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int posicaoB = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um n�emro no Vetor A: ");
			vetorA[i] = scan.nextInt();
			
		}
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0 ) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0 ) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			}
		}
	
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor de pares B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

	}
}
