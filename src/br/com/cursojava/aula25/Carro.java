package br.com.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double volumCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + volumCombustivel * consumoCombustivel + "km" );
		
	}
}
