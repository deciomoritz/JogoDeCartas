public class JogadaSimples implements Jogada{

	private Jogador executor;
	private Interagível afetado;
	protected CartaAbstrata carta;
	
	public JogadaSimples(Interagível afetado, ExemplarDeCarta exemplar, Jogador executor) {
		this.executor = executor;
		this.afetado = afetado;
		this.carta = exemplar.getCarta();
	}

	@Override
	public void executar() {
		carta.interagir(afetado);
	}

	@Override
	public Jogador executor() {
		return executor;
	}

	@Override
	public Tipo tipoCarta() {
		return carta.getTipo();
	}
}
