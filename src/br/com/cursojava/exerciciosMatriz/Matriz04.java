package br.com.cursojava.exerciciosMatriz;

import java.util.Scanner;

public class Matriz04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] agenda = new String[31][24]; // 31 dias e 24 horas.

		boolean sair = false;
		int opcao;

		while (!sair) {
			System.out.println("Digite 0 para sair: ");
			System.out.println("Digite 1 para adicionar compromisso na agenda: ");
			System.out.println("Digite 2 para verificar compromisso na agenda: ");

			opcao = scan.nextInt();

			if (opcao == 1 || opcao == 2) {
				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido digite novamente!");
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com o horario: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora invalida digite novamente!");
					}
				}
				if (opcao == 1) {
					System.out.println("Digite o compromisso");
					agenda[--dia][hora] = scan.next();
				} else if (opcao == 2) {
					dia--;
					System.out.println("O compromisso agendado �: ");
					System.out.println(agenda[dia][hora]);
				}
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Op��o invalida digite a op��o correta");
			}
		}

	}
}
