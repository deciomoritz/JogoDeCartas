import java.util.HashSet;
import java.util.Set;

public class GerenciadorDeContas {
	
	private Set<Conta> contas;
	
	public GerenciadorDeContas() {
		contas = new HashSet<Conta>();
	}
	
	public boolean adicionar(Conta c) {
		return contas.add(c);
	}

	public boolean existe(Conta c) {
		return contas.contains(c);
	}
}
