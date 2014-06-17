import java.util.Random;

public class Partida {

	private Jogador usuario;
	private Jogador oponente;
	private String nome;

	private Turno tAtual;

	private boolean oponenteConectado;

	public void iniciar() {
		distribuiCartas();

		tAtual = new Turno();

		tAtual.setJogador(decideInicio());
	}

	public void efetuar(Jogada j) {

	}

	public Jogador usuarioTurno() {
		if (tAtual.getJ() == usuario)
			return usuario;
		return oponente;
	}

	public Jogador oponenteTurno() {
		if (tAtual.getJ() == usuario)
			return oponente;
		return usuario;
	}

	public void distribuiCartas() {
		Mao mUsuario = new Mao();
		Mao mOponente = new Mao();

		Baralho bUsuario = usuario.getBaralho();
		Baralho bOponente = oponente.getBaralho();
		Random r = new Random();

		for (int i = 0; i < Config.QTDE_INICIAL_MAO; i++) {
			ExemplarDeCarta e1 = bUsuario.getCarta(r.nextInt(bUsuario.getTamanho()));
			mUsuario.adicionar(e1);
			bUsuario.remover(e1);
			
			ExemplarDeCarta e2 = bOponente.getCarta(r.nextInt(bOponente.getTamanho()));
			mOponente.adicionar(e2);
			bOponente.remover(e2);
		}
		usuario.receber(mUsuario);
		oponente.receber(mOponente);
	}

	public Jogador decideInicio() {
		Random r = new Random();
		if (r.nextBoolean())
			return usuario;
		return oponente;
	}

	public Partida(Jogador usuario, String nome) {
		this.usuario = usuario;
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
		return usuario;
	}

	public Jogador login() {
		return oponente;
	}
}
