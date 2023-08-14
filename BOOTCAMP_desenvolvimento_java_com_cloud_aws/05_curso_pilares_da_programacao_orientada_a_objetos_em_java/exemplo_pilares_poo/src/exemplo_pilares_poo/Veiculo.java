package exemplo_pilares_poo;

public abstract class Veiculo {
	
	// Declarando chassi do veículo
		private String chassi;
		
		public void setChassi(String chassi) {
			this.chassi = chassi;
		}
		
		public String getChassi() {
			return chassi;
		}
		
		public abstract void ligar();
		
		

}
