package modelo;

public class Partida {

	private Jogador jogador;
	private Jogador oponente;
	private String nome;

	private Turno tAtual;

	private boolean oponenteConectado;

	public void iniciar() {
		distribuiCartas(jogador);
		distribuiCartas(oponente);

		tAtual = new Turno(jogador, oponente);
		
		preTurno(tAtual.jogador());
	}

	public boolean efetuar(Jogada jogada) {
		if (jogada.executor() == tAtual.jogador()) {
			jogada.executar();
			if (!terminada()) {
				tAtual.passarVez(jogador, oponente);
				preTurno(tAtual.jogador());
				return true;
			}
		}
		return false;
	}

	private void preTurno(Jogador j) {
		j.comprarCarta();
	}

	public boolean terminada() {
		return !(jogador.vivo() && oponente.vivo());
	}

	public Jogador vencedor() {
		if (terminada()) {
			if (jogador.vivo())
				return jogador;
			return oponente;
		}
		return null;
	}

	public void distribuiCartas(Jogador j) {
		Baralho b = j.getBaralho();

		for (int i = 0; i < Config.QTDE_INICIAL_MAO; i++) {
			ExemplarDeCarta e1 = b.comprar();
			b.remover(e1);
			j.receber(e1);
		}
	}

	public Partida(Jogador usuario, String nome) {
		this.jogador = usuario;
		this.nome = nome;
		oponenteConectado = false;
	}

	public boolean conectar(Jogador oponente) {
		if (!oponenteConectado) {
			this.oponente = oponente;
			oponenteConectado = true;
		}
		return oponenteConectado;
	}

	public String getNome() {
		return nome;
	}

	public Jogador usuario() {
		return jogador;
	}

	public Jogador login() {
		return oponente;
	}
}
