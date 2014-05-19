

import java.util.HashSet;
import java.util.Set;

public class ListaDeBaralhos {
	
	private Set<Baralho> baralhos;
	
	public ListaDeBaralhos() {
		baralhos = new HashSet<Baralho>();
	}
	
	public boolean existe(String nome) {
		for (Baralho baralho : baralhos) {
			if(baralho.getNome() == nome)
				return true;
		}
		return false;
	}
	
	public boolean adicionar(Baralho b) {
		return baralhos.add(b);
	}

}
