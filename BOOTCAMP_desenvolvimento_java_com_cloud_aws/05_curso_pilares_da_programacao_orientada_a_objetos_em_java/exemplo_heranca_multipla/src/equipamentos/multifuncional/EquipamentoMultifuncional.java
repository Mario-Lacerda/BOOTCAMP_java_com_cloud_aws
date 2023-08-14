package equipamentos.multifuncional;

// Importando interfaces para implementar
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional 
implements Copiadora, Digitalizadora, Impressora{
		
		// Criando método obrigatório de copiadoras
		public void copiar() {
			System.out.println("Copiando via Multifuncional");
		}
		// Criando método obrigatório de digitalizadoras
		public void digitalizar() {
			System.out.println("Digitalizando via Multifuncional");
		}
		
		// Criando método obrigatório de impressoras
		public void imprimir() {
			System.out.println("Imprimindo via Multifuncional");
		}
}
