package carros;

public class Aviao extends Carro {
	double envergadura;

	// metodo
	void aterrizar() {
		System.out.println("Avi�o pousou.");
	}

	// polimorfismo (reescrever o metodo aterrizar)
	void acelerar() {
		System.out.println("Avi�o decolou ........");
	}

    }
