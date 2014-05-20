public class Jogo {

	private GerenciadorDeContas g;
	private Validador v;
	private ListaDeBaralhos l;

	private Baralho baralhoTemp;
	
	public Baralho getBaralhoTemp(){
		return baralhoTemp;
	}
	
	public ListaDeBaralhos getListaDeBaralhos(){
		return l;
	}

	public Jogo() {
		g = new GerenciadorDeContas();
		v = new Validador();
		l = new ListaDeBaralhos();
	}

	public void init() {
		new Jogo();
	}

	public void remover(Carta c, Baralho b) {
		ExemplarDeCarta e = c.getExemplar();
		b.remover(e);
	}

	public boolean criarConta(String login, String senha) {
		Conta c = FabricaConta.criar(login, senha);
		return g.adicionar(c);
	}

	public void adicionar(Carta c, Baralho b) {
		ExemplarDeCarta e = c.getExemplar();
		b.adicionar(e);
	}

	public boolean salvarBaralhoTemporario() {
		return salvar(baralhoTemp);
	}

	public boolean salvar(Baralho b) {
		if (!v.validar(baralhoTemp))
			return false;
		return l.adicionar(baralhoTemp);
	}

	public void editarBaralho(Baralho b, Carta c, Decisao d) {
		switch (d) {
		case REMOVER:
			this.remover(c, b);
			break;
		case ADICIONAR:
			this.adicionar(c, b);
			break;
		default:
			break;
		}
	}

	public void editarBaralho(Carta c, Decisao d) {
		editarBaralho(baralhoTemp, c, d);
	}

	public boolean montar(String nome) {
		if (!l.existe(nome)) {
			baralhoTemp = new Baralho(nome);
			return true;
		}
		return false;
	}

	public boolean logar(String login, String senha) {
		Conta c = FabricaConta.criar(login, senha);
		return g.existe(c);
	}

}
