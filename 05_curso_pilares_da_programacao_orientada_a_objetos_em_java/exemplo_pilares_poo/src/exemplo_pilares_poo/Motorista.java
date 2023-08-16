package exemplo_pilares_poo;

public class Motorista {
	public static void main(String[] args) {
		
		// Declarando Carro e informando chassi
		Carro jeep = new Carro();
		jeep.setChassi("134144");
		
		// Declarando Moto e informando chassi
		Moto x400 = new Moto();
		x400.setChassi("145621");
		
		Veiculo coringa = x400;
		
		coringa.ligar();
		
		
	}
}
