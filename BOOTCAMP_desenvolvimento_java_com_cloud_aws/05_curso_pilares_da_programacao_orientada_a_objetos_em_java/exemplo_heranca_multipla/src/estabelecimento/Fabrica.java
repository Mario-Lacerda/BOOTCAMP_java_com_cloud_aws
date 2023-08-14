package estabelecimento;

// Importando interfaces criadas para testar uso
import equipamentos.impressora.Impressora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.copiadora.Copiadora;

// Importando equipamento multifuncional
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	
	public static void main(String[] args) {
		// Declarando equipamento multifuncional
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		// Atribuindo equipamento multifuncional às interfaces específicas
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora= em;
		
		// Realizando operações das interfaces através do equipamento
		// Multifuncional
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();

	}

}
