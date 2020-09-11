package carros;

public class Garagem {

	public static void main(String[] args) {
		//objeto 1
		Carro mustang = new Carro();
		mustang.ano = 2015;
		mustang.cor = "Amarelo";
        System.out.println("Carro : Mustang");
        System.out.println("Ano " + mustang.ano);
        System.out.println("Cor " + mustang.cor);
        mustang.ligado();
        mustang.acelerar();
       
        //objeto 2
        Carro fiesta = new Carro();
		fiesta.ano = 2010;
		fiesta.cor = "Branco";
        System.out.println("Carro : Fiesta");
        System.out.println("Ano " + fiesta.ano);
        System.out.println("Cor " + fiesta.cor);
        fiesta.ligado();
        fiesta.acelerar(); 
        
        //objeto 3
        Carro celta = new Carro();
        celta.ano = 2013;
        celta.cor = "Prata";
        System.out.println("Carro : Celta");
        System.out.println("Ano " + celta.ano);
        System.out.println("Cor " + celta.cor);
        celta.ligado();
        celta.acelerar();
        
        //objeto 4
        Carro prisma = new Carro();
        prisma.ano = 2014;
        prisma.cor = "Vermelho";
        System.out.println("Carro : Prisma");
        System.out.println("Ano " + prisma.ano);
        System.out.println("Cor " + prisma.cor);
        prisma.ligado();
        prisma.acelerar();
	    }

        }
