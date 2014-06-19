public class JogadaSimples implements Jogada{

	private Jogador executor;
	private Interag�vel afetado;
	protected CartaAbstrata carta;
	
	public JogadaSimples(Interag�vel afetado, ExemplarDeCarta exemplar, Jogador executor) {
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
