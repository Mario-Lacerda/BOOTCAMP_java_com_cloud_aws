package exemplo_enum;

public class SistemaIbge {
	public static void main(String[] args) {
		for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + "-" + e.getNome());
		}
		
		// Nesse momento a variável eb está sendo representada pelo rio de janeiro
		// Como se instanciasse um objeto com as informações do RJ
		EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;
		
		// Dar um get, retorna as informações de Piauí
		eb.getNome();
		eb.getSigla();
		eb.getNomeMaiusculo();

	}
}
