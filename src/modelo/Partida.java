package modelo;
import java.util.Random;

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
	}

	public boolean efetuar(Jogada j) {
		if (j.executor() == tAtual.jogador()) {
			j.executar();
			tAtual.passarVez(jogador, oponente);
			tAtual.jogador().comprarCarta();
			return true;
		}
		return false;
	}

	public void distribuiCartas(Jogador j) {
		Mao m = new Mao();

		Baralho b = j.getBaralho();
		Random r = new Random();

		for (int i = 0; i < Config.QTDE_INICIAL_MAO; i++) {
			ExemplarDeCarta e1 = b.getExemplar(r.nextInt(b.getTamanho()));
			m.adicionar(e1);
			b.remover(e1);
		}
		j.receber(m);
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
