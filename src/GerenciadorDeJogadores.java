import java.util.HashSet;
import java.util.Set;

public class GerenciadorDeJogadores {
	
	private Set<Jogador> jogadores;
	
	public GerenciadorDeJogadores() {
		jogadores = new HashSet<Jogador>();
	}
	
	public boolean adicionar(Jogador j) {
		for (Jogador jo : jogadores) {
			if(jo.getLogin() == j.getLogin())
				return false;
		}
		return jogadores.add(j);
	}

	public boolean existe(Jogador j) {
		return jogadores.contains(j);
	}
}
