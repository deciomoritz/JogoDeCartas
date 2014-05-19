import java.util.ArrayList;

public class Jogo {
	
	private GerenciadorDeContas g;
	private Validador v;
	private ListaDeBaralhos l;
	private Acervo a;
	
	private Baralho baralhoTemp;
	
	public Jogo() {
		g = new GerenciadorDeContas();
		v = new Validador();
		l = new ListaDeBaralhos();
		a = new Acervo();
	}
	
	public void init(){
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
	
	public void salvar(Baralho b) {
		l.adicionar(b);
	}
	
	public void editarBaralho(Baralho b, Carta c, Decisao d) {
		while(d != Decisao.TERMINAR) {
			d = acao();
			
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
	}

	public boolean montar(String nome) {
		if(!l.existe(nome)){
			baralhoTemp = new Baralho(nome);
			return true;
		}
		return false;
	}
	
	public boolean logar(String login, String senha) {
		Conta c = FabricaConta.criar(login, senha);
		return g.existe(c);
	}
	
	public Decisao acao() {
		// TODO: perguntar a visão
		return null;
	}

}
