package carros;

public class Hangar {

	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2017;
		boeing777.cor = "Azul";
		boeing777.envergadura = 65;
		System.out.println("Avião : Boeing 777");
		System.out.println("Ano : " + boeing777.ano);
		System.out.println("Cor : " + boeing777.cor);
		System.out.println("Evergadura : " + boeing777.envergadura);
		boeing777.ligado();
		boeing777.acelerar();
 
	   }

       }
