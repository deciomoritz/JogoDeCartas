

import java.util.ArrayList;

public class Jogo {
	
	private FabricaConta f;
	private GerenciadorDeContas g;
	private Validador v;
	private ListaDeBaralhos l;
	private Acervo a;
	
	public Jogo() {
		// TODO
		f = new FabricaConta();
		g = new GerenciadorDeContas();
		v = new Validador();
		l = new ListaDeBaralhos();
		a = new Acervo();
	}
	
	public void remover(Carta c, Baralho b) {
		ExemplarDeCarta e = c.getExemplar();
		b.remover(e);
	}
	
	public boolean criarConta(String login, String senha) {
		Conta c = f.criar(login, senha);
		return g.adicionar(c);
	}
	
	public void adicionar(Carta c, Baralho b) {
		ExemplarDeCarta e = c.getExemplar();
		b.adicionar(e);
	}
	
	public void salvar(Baralho b) {
		l.adicionar(b);
	}
	
	public void editarBaralho(Baralho b) {
		Decisao d = Decisao.NÃO_TOMADA;
		
		while(d != Decisao.TERMINAR) {
			d = acao();
			
			if(d == Decisao.REMOVER) {
				Carta c = new Carta(); // Aqui pedir a visão.
				this.remover(c, b);
			}
			
			if(d == Decisao.ADICIONAR) {
				Carta c = new Carta(); // Aqui pedir a visão.
				this.adicionar(c, b);
			}
		}
		
		if(v.validar(b)) {
			this.salvar(b);
		}
	}
	
	public boolean montar(String nome) {
		
		if(!l.existe(nome)){
			Baralho novo_b = new Baralho(nome);
			this.editarBaralho(novo_b);
			return true;
		}
		return false;
	}
	
	public boolean logar(String login, String senha) {
		Conta c = f.criar(login, senha);
		return g.existe(c);
	}
	
	public ArrayList<Carta> copiarAcervo() {
		return a.mostrarAcervo();
	}
	
	public Decisao acao() {
		// TODO: perguntar a visão
		return null;
	}

}
