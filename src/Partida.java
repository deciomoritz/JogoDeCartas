import java.util.Random;

public class Partida {

	private Jogador usuario;
	private Jogador oponente;
	private String nome;

	private Turno tAtual;

	private boolean oponenteConectado;

	public void iniciar() {
		distribuiCartas();

		tAtual = new Turno(Turno.decideInicio(usuario, oponente));
		
		System.out.println("Jogador da vez: " + tAtual.jogador().getLogin());
	}

	public boolean efetuar(Jogada j) {
		if (j.executor() == tAtual.jogador()) {
			j.executar();
			tAtual.passarVez(usuario, oponente);
			return true;
		}
		return false;
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
