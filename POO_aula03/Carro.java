package carros;

import java.util.Random;

public class Carro {// classe modelo

	// atributos
	int ano;
	String cor;

	// construtor
	public Carro() {
		System.out.println("==========================");
		Random gerador = new Random();
		int chassi = gerador.nextInt(10000);
		System.out.println("Chassi: " + chassi);
	}

	// metodos
	void ligado() {
		System.out.println("Motor funcionando..........");
	}

	void desligado() {
		System.out.println("Motor sem funcionamento");
	}

	void acelerar() {
		System.out.println("Ruummmmmmmmmm");
	}

    } 
