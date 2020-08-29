package MineCraft;

public class Mundo {

	public static void main(String[] args) {
		//Adilson
		//objeto 1
		Bloco blocoTerra = new Bloco();
		blocoTerra.resistencia = 1;
		blocoTerra.textura = "Terra";
		System.out.println("Bloco " + blocoTerra.textura);
		System.out.println("Resistência: " + blocoTerra.resistencia);
		blocoTerra.minerar();
		blocoTerra.construir();
		//objeto 2
        Bloco blocoMadeira = new Bloco();
        blocoMadeira.resistencia = 2;
		blocoTerra.textura = "Madeira";
		System.out.println("Bloco " + blocoTerra.textura);
		System.out.println("Resistência: " + blocoMadeira.resistencia);
		blocoMadeira.minerar();
		blocoMadeira.craftar();
        
        {
	}

	}
	}
