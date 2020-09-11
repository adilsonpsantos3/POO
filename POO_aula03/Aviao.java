package carros;

public class Aviao extends Carro {
	double envergadura;

	// metodo
	void aterrizar() {
		System.out.println("Avião pousou.");
	}

	// polimorfismo (reescrever o metodo aterrizar)
	void acelerar() {
		System.out.println("Avião decolou ........");
	}

    }
